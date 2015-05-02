package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class DereferenceVname extends Vname {

  public DereferenceVname (Expression eAST, SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
  }

  public Object visit (Visitor v, Object o) {
    return v.visitDereferenceVname(this, o);
  }
  public Expression E;
}