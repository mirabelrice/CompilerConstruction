package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;

public class ReferenceExpression extends Expression {
	public ReferenceExpression(TypeDenoter tAST, SourcePosition thePosition) {
   	 	super(thePosition);
   	 	T = tAST;
  	}

  	public Object visit(Visitor v, Object o) {
    	return v.visitReferenceExpression(this, o);
  	}

  	public TypeDenoter T;
}