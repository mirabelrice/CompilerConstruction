package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;

public class DerefRExpression extends Expression {

  public DerefRExpression(Vname vAST, SourcePosition thePosition) {
    super (thePosition);
    V = vAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitDerefRExpression(this, o);
  }
  public Vname V;
}