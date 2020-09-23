package Test;

import Chess.Color;
import Chess.Queen;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class KingTest {
    void canMove() {
        Queen queen = new Queen(Chess.Color.BLACK);
        Point currentLocation = new Point(4,1);
        Point targetLocation = new Point(4,5);
        Assertions.assertThat(queen.canMove(currentLocation, targetLocation)).isEqualTo(false);
    }

    @Test
    void getMovingPath(){
        Queen queen = new Queen(Color.BLACK);
        Point currentLocation = new Point(4,1);
        Point targetLocation = new Point(4,2);

        Assertions.assertThat(queen.getMovingPath(currentLocation, targetLocation)).isEqualTo(false);
    }
}