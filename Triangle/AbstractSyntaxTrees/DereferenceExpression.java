package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;


public class DereferenceExpression extends Expression{
	public DereferenceExpression(Vname vnAST, SourcePosition thePosition){
		super(thePosition);
		VN = vnAST;
	}

	public Object visit (Visitor v, Object o) {
    	return v.visitDereferenceExpression(this, o);
  	}
	public Vname VN;
}