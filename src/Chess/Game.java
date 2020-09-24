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
        System.out.println("Please type in the x coordinate of the figure you want to move");
        int currentPointX = scan.nextInt();

        System.out.println("Please type in the y coordinate of the figure you want to move");
        int currentPointY = scan.nextInt();

        System.out.println("Please type in the x coordinate of the target location");
        int targetPointX = scan.nextInt();

        System.out.println("Please type in the y coordinate of the target location");
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
