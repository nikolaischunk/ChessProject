package Chess;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Chessboard {

    Map<Point, Figur> board;

    public Chessboard() {
        board = new HashMap<Point, Figur>();
    }

    public void putFiguresIntoMap() {
        //Put Black Figures in the Map
        board.put(new Point(1, 1), new Rook(Color.BLACK));
        board.put(new Point(2, 1), new Knight(Color.BLACK));
        board.put(new Point(3, 1), new Bishop(Color.BLACK));
        board.put(new Point(4, 1), new King(Color.BLACK));
        board.put(new Point(5, 1), new Queen(Color.BLACK));
        board.put(new Point(6, 1), new Bishop(Color.BLACK));
        board.put(new Point(7, 1), new Knight(Color.BLACK));
        board.put(new Point(8, 1), new Rook(Color.BLACK));

        board.put(new Point(1, 2), new Pawn(Color.BLACK));
        board.put(new Point(2, 2), new Pawn(Color.BLACK));
        board.put(new Point(3, 2), new Pawn(Color.BLACK));
        board.put(new Point(4, 2), new Pawn(Color.BLACK));
        board.put(new Point(5, 2), new Pawn(Color.BLACK));
        board.put(new Point(6, 2), new Pawn(Color.BLACK));
        board.put(new Point(7, 2), new Pawn(Color.BLACK));
        board.put(new Point(8, 2), new Pawn(Color.BLACK));

        //Put White Figures in the Map
        board.put(new Point(1, 8), new Rook(Color.WHITE));
        board.put(new Point(2, 8), new Knight(Color.WHITE));
        board.put(new Point(3, 8), new Bishop(Color.WHITE));
        board.put(new Point(5, 8), new King(Color.WHITE));
        board.put(new Point(4, 8), new Queen(Color.WHITE));
        board.put(new Point(6, 8), new Bishop(Color.WHITE));
        board.put(new Point(7, 8), new Knight(Color.WHITE));
        board.put(new Point(8, 8), new Rook(Color.WHITE));

        board.put(new Point(1, 7), new Pawn(Color.WHITE));
        board.put(new Point(2, 7), new Pawn(Color.WHITE));
        board.put(new Point(3, 7), new Pawn(Color.WHITE));
        board.put(new Point(4, 7), new Pawn(Color.WHITE));
        board.put(new Point(5, 7), new Pawn(Color.WHITE));
        board.put(new Point(6, 7), new Pawn(Color.WHITE));
        board.put(new Point(7, 7), new Pawn(Color.WHITE));
        board.put(new Point(8, 7), new Pawn(Color.WHITE));
        // System.out.println(board.toString()); //check if those where added to the HashMaP
    }

    public Boolean isAnyPointTaken(ArrayList<Point> getMovingPath) {
        for (Point p : getMovingPath) {
            isTargetPointTaken(p);
        }
        return true;
    }

    private Boolean isTargetPointTaken(Point userPoint) {
        if (getBoard().containsValue(userPoint)) {
            System.out.println("ERROR");
            return true;
        } else {
            System.out.println("Valid Target");
            return false;
        }
    }

    public void printBoard() {
        System.out.println("\t╔═══════╦═══════╦═══════╦═══════╦═══════╦═══════╦═══════╦═══════╗");
        printLogic();
        System.out.println("\t╚═══════╩═══════╩═══════╩═══════╩═══════╩═══════╩═══════╩═══════╝");
        System.out.println("\t\t1\t\t2\t\t3\t\t4\t\t5\t\t6\t\t7\t\t8");
    }

    public Boolean move(Point currentLocation, Point targetLocation, Color playerColor) {

        Figur figur = board.get(currentLocation);
        if (figur.getColor() != playerColor) {
            ArrayList<Point> figurMovingPath = figur.getMovingPath(currentLocation, targetLocation);
            if (isAnyPointTaken(figurMovingPath)) {
                board.put(targetLocation, figur);
                board.remove(currentLocation);
            } else {
                return false;
            }
        }
        return false;
    }

    public void printLogic(){
        int iii = 0;
        for (int ii = 8; ii >= 1; ii--, iii++) {
            System.out.print(ii + "\t");
            for (int i = 1; i <= 8; i++) {
                Figur figure = board.get(new Point(i, ii));
                System.out.print("║");
                if (figure != null) {
                    System.out.print("\t" + figure.getAppearance() + "\t");
                } else {
                    System.out.print("\t\t");
                }
            }
            System.out.println("║");
            if (iii < 7) {
                System.out.println("\t╠═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╣");
            }
        }
    }
    public Map<Point, Figur> getBoard() {
        return board;
    }
}
