package Chess;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

class PawnTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void canMoveBlack() {
        Pawn pawn = new Pawn(Color.BLACK);
        Point currentLocation = new Point(2, 2);
        Point targetLocation = new Point(2, 3);
        Assertions.assertThat(pawn.canMove(currentLocation, targetLocation)).isEqualTo(true);

    }

    @Test
    void canMoveWhite() {
        Pawn pawn = new Pawn(Color.WHITE);
        Point currentLocation = new Point(2, 7);
        Point targetLocation = new Point(2, 8);
        Assertions.assertThat(pawn.canMove(currentLocation, targetLocation)).isEqualTo(true);

    }

    @Test
    void getMovingPathBlack() {
        Pawn pawn = new Pawn(Color.BLACK);
        Point currentLocation = new Point(2, 2);
        Point targetLocation = new Point(2, 2);
        Assertions.assertThat(pawn.getMovingPath(currentLocation, targetLocation)).isEqualTo(false);
    }

    @Test
    void getMovingPathWHITE() {
        Pawn pawn = new Pawn(Color.WHITE);
        Point currentLocation = new Point(2, 2);
        Point targetLocation = new Point(2, 2);
        Assertions.assertThat(pawn.getMovingPath(currentLocation, targetLocation)).isEqualTo(false);
    }
}