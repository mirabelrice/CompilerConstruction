package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;


public class ReferenceExpression extends Expression{
	public ReferenceExpression(Vname vnAST, SourcePosition thePosition){
		super(thePosition);
		VN = vnAST;
	}

	public Object visit (Visitor v, Object o) {
    	//return v.visitReferenceExpression(this, o);
    	return null;
  	}
	public Vname VN;
}