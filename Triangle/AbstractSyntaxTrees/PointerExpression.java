package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;

public class PointerExpression extends Expression {

  public PointerExpression(TypeDenoter tdAST, SourcePosition thePosition) {
    super (thePosition);;
    TD = tdAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitConstDeclaration(this, o);
  }
  public TypeDenoter TD;
}