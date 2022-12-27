import application.UI;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.Scanner;
import javax.xml.transform.Source;

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("====================================");

    ChessMatch chessMatch = new ChessMatch();

    while (true) {
      UI.printBoard(chessMatch.getPieces());
      System.out.println();
      System.out.print("Source: ");
      ChessPosition source = UI.readChessPosition(sc);

      System.out.println();
      System.out.print("Target: ");
      ChessPosition target = UI.readChessPosition(sc);

      ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
    }
  }
}
