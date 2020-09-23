package Test;

import Chess.Color;
import Chess.Queen;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

//for simge
class QueenTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void canMoveQueen() {
        Queen queen = new Queen(Color.BLACK);
        Point currentLocation = new Point(5, 1);
        Point targetLocation = new Point(5, 5);
        Assertions.assertThat(queen.canMove(currentLocation, targetLocation)).isEqualTo(true);
    }

    @Test
    void getMovingPathQueen() {
        Queen queen = new Queen(Color.BLACK);
        Point currentLocation = new Point(5, 1);
        Point targetLocation = new Point(5, 5);
        Assertions.assertThat(queen.getMovingPath(currentLocation, targetLocation)).isEqualTo(false);
    }
}