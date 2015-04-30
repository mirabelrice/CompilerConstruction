package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;

public class DereferenceExpression extends Expression {

  public DereferenceExpression(Identifier iAST, SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitDereferenceExpression(this, o);
  }

  public Identifier I;
}