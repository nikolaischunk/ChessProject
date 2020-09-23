package Test;
import Chess.Color;
import Chess.Queen;
import org.assertj.core.api.Assertions;
import org.junit.Assert;

import org.junit.jupiter.api.Test;
import java.awt.*;


class QueenTest {

    @Test
    void canMove() {
        Queen queen = new Queen(Color.BLACK);
        Point currentLocation = new Point(5,1);
        Point targetLocation = new Point(5,5);
        Assertions.assertThat(queen.canMove(currentLocation, targetLocation)).isEqualTo(true);

    }

}