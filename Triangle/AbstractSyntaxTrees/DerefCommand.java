package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;

public class DerefCommand extends Command {

  public DerefCommand(Expression e1AST, Expression e2AST, SourcePosition thePosition) {
    super (thePosition);
    E1 = e1AST;
    E2 = e2AST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitDerefCommand(this, o);
  }

  public Expression E1;
  public Expression E2;
}
