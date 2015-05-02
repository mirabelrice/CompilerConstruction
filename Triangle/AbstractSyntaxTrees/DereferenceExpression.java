package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;

public class DereferenceExpression extends Expression {

  public DereferenceExpression(Vname vAST, SourcePosition thePosition) {
    super (thePosition);
    V = vAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitDereferenceExpression(this, o);
  }

  public Vname V;
}