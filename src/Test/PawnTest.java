package Test;

import Chess.Color;
import Chess.Pawn;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

class PawnTest {


    @Test
    void canMoveBlack() {
        Pawn pawn = new Pawn(Chess.Color.BLACK);
        Point currentLocation = new Point(2, 2);
        Point targetLocation = new Point(2, 3);
        Assertions.assertThat(pawn.canMove(currentLocation, targetLocation)).isEqualTo(true);

    }

    @Test
    void canMoveWhite() {
        Pawn pawn = new Pawn(Chess.Color.WHITE);
        Point currentLocation = new Point(2, 7);
        Point targetLocation = new Point(2, 8);
        Assertions.assertThat(pawn.canMove(currentLocation, targetLocation)).isEqualTo(true);

    }

}