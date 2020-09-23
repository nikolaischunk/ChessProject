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
    void canMove() {
        Pawn pawn = new Pawn(Color.BLACK);
        Point currentLocation = new Point(5, 1);
        Point targetLocation = new Point(5, 5);
        Assertions.assertThat(pawn.canMove(currentLocation, targetLocation)).isEqualTo(true);

    }
}