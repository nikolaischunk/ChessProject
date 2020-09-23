package Test;
import Chess.Color;
import Chess.Queen;
import org.assertj.core.api.Assertions;
import org.junit.Assert;

import org.junit.jupiter.api.Test;
import java.awt.*;

//for simge
class QueenTest {


    @Test
    void canMove() {
        //BLACK
        Queen queenB = new Queen(Color.BLACK);
        Point currentLocationB = new Point(5,1);
        Point targetLocationB = new Point(5,5);

        //WHITE
        Queen queenW = new Queen(Color.WHITE);
        Point currentLocationW = new Point(5,1);
        Point targetLocationW = new Point(5,5);
        Assertions.assertThat(queenW.canMove(currentLocationW, targetLocationW)).isEqualTo(true);
    }

    @Test
    void getMovingPath(){
        //BLACK
        Queen queenB = new Queen(Color.BLACK);
        Point currentLocationB = new Point(5,1);
        Point targetLocationB = new Point(5,5);

        //WHITE
        Assertions.assertThat(queenB.getMovingPath(currentLocationB, targetLocationB)).isEqualTo(false);
    }


