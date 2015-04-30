package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;

public class ReferenceExpression extends Expression {
	public ReferenceExpression(Vname vAST, SourcePosition thePosition) {
   	 	super(thePosition);
   	 	V = vAST;

  	}

  	public Object visit(Visitor v, Object o) {
    	return v.visitReferenceExpression(this, o);
  	}

  	public Vname V;
}