package TAM;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;

public class FreeList {
	/*
	public FreeList() {
		//HF = null;
		listSize = 0;
	}
	*/

	//when data deallocated, add new gap to list
	public void addHeapBlock(int p_size, int addr) {
		System.out.println("in add heap block" + "Size: " + p_size );

		if(listSize == 0) {//list is empty
			HeapBlock newGap = new HeapBlock(p_size, addr);
			HF = newGap;//this is the first gap in the list
		}else{//list is not empty
			HeapBlock iter = HF;
			while(iter.nextBlock != null) {//find end of list
				iter = iter.nextBlock;
			}
			HeapBlock newGap = new HeapBlock(p_size, addr);
			iter.nextBlock = newGap;
		}
		listSize++;
	}
 
	//search for gap of size needed
	//if one exists remove from list and return address
	//if no gap with needed size, return 0
	public int findHeapBlock(int p_size) {
		if(isEmpty()){//no gaps currently in heap 
			System.out.println("list is empty");
			return 0;
		}

		System.out.println("in find heap block" + "Size: " + p_size );

		HeapBlock iter = HF;
		HeapBlock prev = null;

		//search list for needed gap size
		while(iter != null){
			if(iter.size == p_size){//gap is the first in list
				if(iter == HF){
					HF = iter.nextBlock;
				}else{
					prev.nextBlock = iter.nextBlock;
				}
				listSize--;
				System.out.println("address: " + iter.address);
				return iter.address;
			}
			prev = iter;
			iter = iter.nextBlock;
		}
		return 0;
	}

	//if empty, no gaps in heap. must expand heap.
	public boolean isEmpty() {
		if(listSize != 0){
			return false;
		}
		return true;
	}

	private static class HeapBlock {
		private int size; //size of the gap
		private int address;
		private HeapBlock nextBlock; //pointer to next gap in list

		public HeapBlock(){
			size = 0;
			address = 0;
			nextBlock = null;
		}

		public HeapBlock(int p_size, int p_addr){
			size = p_size;
			address = p_addr;
			nextBlock = null;	
		}
	}

	public HeapBlock HF;
	public int listSize;
}
