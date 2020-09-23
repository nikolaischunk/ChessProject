package Chess;

import java.awt.*;
import java.util.Scanner;

public class Game {

    Chessboard chessboard = new Chessboard();
    Player player1 = new Player("Nikolai", Color.BLACK);
    Player player2 = new Player("Stefan", Color.WHITE);
    Point currentPoint = new Point();
    Point targetPoint = new Point();

    public void startGame() {
        chessboard.putFiguresIntoMap();
        printBoard();
    }

    public void whereToMove() {
        Player currentPlayer = player1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie die die x Kordinate an von der zu bewegenden Chess.Figur");
        int currentPointX = scan.nextInt();

        System.out.println("Geben Sie die die y Kordinate an von der zu bewegenden Chess.Figur");
        int currentPointY = scan.nextInt();

        System.out.println("Geben Sie die die x Kordinate an von der Zielkordinate");
        int targetPointX = scan.nextInt();

        System.out.println("Geben Sie die die y Kordinate an von der Zielkordinate");
        int targetPointY = scan.nextInt();


        currentPoint.x = currentPointX;
        currentPoint.y = currentPointY;
        targetPoint.x = targetPointX;
        targetPoint.y = targetPointY;


        chessboard.move(currentPoint, targetPoint, currentPlayer.getColor());
        System.out.println(chessboard.board.get(currentPoint));
        printBoard();
    }

    public void printBoard() {
        chessboard.printBoard();
    }

}
