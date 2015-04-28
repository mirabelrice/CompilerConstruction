package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;

public class DereferenceExpression extends Expression {

  public DereferenceExpression (TypeDenoter tAST, SourcePosition thePosition) {
    super (thePosition);
    T = tAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitDereferenceExpression(this, o);
  }

  public TypeDenoter T;
}