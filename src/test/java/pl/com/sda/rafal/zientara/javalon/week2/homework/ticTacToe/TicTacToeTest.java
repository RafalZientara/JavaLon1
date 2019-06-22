package pl.com.sda.rafal.zientara.javalon.week2.homework.ticTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    TicTacToe game;

    @BeforeEach
    public void setup() {
        // given
        game = new TicTacToe();
        System.out.println("Reset");
    }

    @Test
    public void atStartFieldsAreEmpty() {
        //given
        // when
        // do nothing

        // then
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Checking field row %d, col %d\n", i, j);
                assertEquals(TicTacToe.FIELD_EMPTY,
                        game.getFieldStatus(i, j));
            }
        }
    }

    @Test
    public void gettingFieldOutOfBoundsShouldThrowFromLeft() {
        //given
        //when
        //do nothing

        assertThrows(IllegalArgumentException.class,
                () -> game.getFieldStatus(-1, 0));
    }

    @Test
    public void gettingFieldOutOfBoundsShouldThrowFromRight() {
        //given
        //when
        //do nothing

        assertThrows(IllegalArgumentException.class,
                () -> game.getFieldStatus(3, 0));
    }

    @Test
    public void gettingFieldOutOfBoundsShouldThrowFromTop() {
        //given
        //when
        //do nothing

        assertThrows(IllegalArgumentException.class,
                () -> game.getFieldStatus(0, -1));
    }

    @Test
    public void gettingFieldOutOfBoundsShouldThrowFromBottom() {
        //given
        //when
        //do nothing

        assertThrows(IllegalArgumentException.class,
                () -> game.getFieldStatus(0, 3));
    }

    @Test
    public void playerXIsAlwaysFirst() {
        //given
        //when
        //do nothing

        //then
        assertTrue(game.isPlayerXTurn());
    }

    @Test
    public void firstMovePlayerX() {
        // given
        // when
        game.addMark(0, 0);

        // then
        assertEquals(TicTacToe.FIELD_X,
                game.getFieldStatus(0, 0));
        assertTrue(game.isPlayerOTurn());
        assertFalse(game.isPlayerXTurn());
    }

    @Test
    public void secondMovePlayerO() {
        //given
        game.addMark(0, 0);

        //when
        game.addMark(1, 0);

        // then
        assertEquals(TicTacToe.FIELD_O,
                game.getFieldStatus(1, 0));
        assertFalse(game.isPlayerOTurn());
        assertTrue(game.isPlayerXTurn());
    }


    // 9
    @Test
    public void playerCantMarkOccupiedField() {
        //given
        game.addMark(0, 0);

        game.printBoard();
        //when then
        assertThrows(FieldOcuppiedException.class,
                () -> game.addMark(0, 0));
    }

    @Test
    public void playerXWinsWithHorizontalCombo() {
        //given
        game.addMark(0,0);
        game.addMark(2,2);
        game.addMark(0,1);
        game.addMark(1,0);
        game.addMark(0,2);

        game.printBoard();
        //when then
        assertEquals(GameResult.PLAYER_X_WIN,
                game.getResult());

    }

    @Test
    public void playerOWinsWithHorizontalCombo() {
        //given
        game.addMark(0,0);
        game.addMark(1,0);
        game.addMark(2,1);
        game.addMark(1,1);
        game.addMark(0,2);
        game.addMark(1,2);

        game.printBoard();
        //when then
        assertEquals(GameResult.PLAYER_O_WIN,
                game.getResult());

    }


}