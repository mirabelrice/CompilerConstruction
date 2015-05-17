/*
 * @(#)Token.java                        2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package Triangle.SyntacticAnalyzer;


final class Token extends Object {

  protected int kind;
  protected String spelling;
  protected SourcePosition position;

  public Token(int kind, String spelling, SourcePosition position) {

    if (kind == Token.IDENTIFIER) {
      int currentKind = firstReservedWord;
      boolean searching = true;

      while (searching) {
        int comparison = tokenTable[currentKind].compareTo(spelling);
        if (comparison == 0) {
          this.kind = currentKind;
          searching = false;
        } else if (comparison > 0 || currentKind == lastReservedWord) {
          this.kind = Token.IDENTIFIER;
          searching = false;
        } else {
          currentKind ++;
        }
      }
    } else
      this.kind = kind;

    this.spelling = spelling;
    this.position = position;

  }

  public static String spell (int kind) {
    return tokenTable[kind];
  }

  public String toString() {
    return "Kind=" + kind + ", spelling=" + spelling +
      ", position=" + position;
  }

  // Token classes...

  public static final int

    // literals, identifiers, operators...
    INTLITERAL	= 0,
    CHARLITERAL	= 1,
    IDENTIFIER	= 2,
    OPERATOR	= 3,

    // reserved words - must be in alphabetical order...
    ARRAY		= 4,
    BEGIN		= 5,
    CONST		= 6,
    DELETE	= 7,
    DO      = 8,
    ELSE		= 9,
    END			= 10,
    FUNC		= 11,
    IF			= 12,
    IN			= 13,
    LET			= 14,
    NEW     = 15,
    OF			= 16,
    POINTER	= 17,
    PROC    = 18,
    RECORD	= 19,
    THEN		= 20,
    TO      = 21,
    TYPE		= 22,
    VAR			= 23,
    WHILE		= 24,

    // punctuation...

    DOT			= 25,
    COLON		= 26,
    SEMICOLON	= 27,
    COMMA		= 28,
    BECOMES		= 29,
    IS			= 30,
    DEREFERENCE = 31,
    REFERENCE = 32,

    // brackets...
    LPAREN		= 33,
    RPAREN		= 34,
    LBRACKET	= 35,
    RBRACKET	= 36,
    LCURLY		= 37,
    RCURLY		= 38,

    // special tokens...
    EOT			= 39,
    ERROR		= 40;

  private static String[] tokenTable = new String[] {
    "<int>",
    "<char>",
    "<identifier>",
    "<operator>",
    "array",
    "begin",
    "const",
    "delete",
    "do",
    "else",
    "end",
    "func",
    "if",
    "in",
    "let",
    "new",
    "of",
    "pointer",
    "proc",
    "record",
    "then",
    "to",
    "type",
    "var",
    "while",
    ".",
    ":",
    ";",
    ",",
    ":=",
    "~",
    "^",
    "&",
    "(",
    ")",
    "[",
    "]",
    "{",
    "}",
    "",
    "<error>"
  };

  private final static int	firstReservedWord = Token.ARRAY,
  				lastReservedWord  = Token.WHILE;

}
