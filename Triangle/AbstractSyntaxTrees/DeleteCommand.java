package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;

public class DeleteCommand extends Command {

  public DeleteCommand(Expression eAST, SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitDeleteCommand(this, o);
  }

  public Expression E;
}
