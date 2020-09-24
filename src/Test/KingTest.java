package Test;

import Chess.Color;
import Chess.King;
import Chess.Queen;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;


class KingTest {

    @Test
    void canMoveBlack() {
        King king = new King(Chess.Color.BLACK);
        Point currentLocation = new Point(4, 1);
        Point targetLocation = new Point(4, 2);
        Assertions.assertThat(king.canMove(currentLocation, targetLocation)).isEqualTo(true);
    }

    @Test
    void canMoveWhite() {
        King king = new King(Color.WHITE);
        Point currentLocation = new Point(4, 8);
        Point targetLocation = new Point(4, 7);
        Assertions.assertThat(king.canMove(currentLocation, targetLocation)).isEqualTo(true);
    }

//    @Test
//    void getKingMovingPath(){
//        King king = new King(Color.BLACK);
//        ArrayList<Point> movingPath = new ArrayList<>();
//        Point currentLocation = new Point(4, 1);
//        Point targetLocation = new Point(4, 2);
//        movingPath.add(currentLocation);
//        movingPath.add(currentLocation);
//        Assertions.assertThat(king.getMovingPath(currentLocation, targetLocation)).size().isEqualsTo(getKingMovingPath());
//
//    }

}