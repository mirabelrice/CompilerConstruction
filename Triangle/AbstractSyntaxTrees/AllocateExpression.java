package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;


public class AllocateExpression extends Expression{
	public AllocateExpression(TypeDenoter tAST, SourcePosition thePosition){
		super(thePosition);
		T = tAST;
	}
	
	public Object visit (Visitor v, Object o) {
    	return v.visitAllocateExpression(this, o);
  	}
  	public TypeDenoter T;
}