package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;

public class DerefLExpression extends Expression {

  public DerefLExpression(Vname vAST, SourcePosition thePosition) {
    super (thePosition);
    V = vAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitDerefLExpression(this, o);
  }
  public Vname V;
}