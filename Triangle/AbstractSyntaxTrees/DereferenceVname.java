package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class DereferenceVname extends Vname {

  public DereferenceVname (Vname vAST, Expression eAST, SourcePosition thePosition) {
    super (thePosition);
    V = vAST;
    E = eAST;
  }

  public Object visit (Visitor v, Object o) {
    return v.visitDereferenceVname(this, o);
  }

  public Vname V;
  public Expression E;
}