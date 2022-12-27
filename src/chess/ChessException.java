package chess;

import boardgame.boardExcepition;

public class ChessException extends boardExcepition {

  private static final long serialVersionUNID = 1L;

  public ChessException(String msg) {
    super(msg);
  }
}
