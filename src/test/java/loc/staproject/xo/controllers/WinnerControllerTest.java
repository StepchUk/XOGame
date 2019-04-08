package loc.staproject.xo.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import loc.staproject.xo.model.Field;
import loc.staproject.xo.model.Figure;
import loc.staproject.xo.model.Point;

public class WinnerControllerTest {
    @Test
    public void testGetWhenWinnerRow() throws Exception {
        final WinnerController winnerController = new WinnerController();

        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.X);
            assertEquals(Figure.X, winnerController.getWinner(field));
        }
    }

    @Test
    public void testGetWhenNoWinnerRow() throws Exception {
        final WinnerController winnerController = new WinnerController();

        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.O);
            assertNull(winnerController.getWinner(field));
        }
    }

    @Test
    public void testGetWhenWinnerColumn() throws Exception {
        final WinnerController winnerController = new WinnerController();

        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, i), Figure.X);
            field.setFigure(new Point(1, i), Figure.X);
            field.setFigure(new Point(2, i), Figure.X);
            assertEquals(Figure.X, winnerController.getWinner(field));
        }
    }

    @Test
    public void testGetWhenNoWinnerColumn() throws Exception {
        final WinnerController winnerController = new WinnerController();

        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, i), Figure.X);
            field.setFigure(new Point(1, i), Figure.X);
            field.setFigure(new Point(2, i), Figure.O);
            assertNull(winnerController.getWinner(field));
        }
    }

    @Test
    public void testGetWhenWinnerDiag1() throws Exception {
        final WinnerController winnerController = new WinnerController();

            final Field field = new Field(3);
            field.setFigure(new Point(0, 0), Figure.X);
            field.setFigure(new Point(1, 1), Figure.X);
            field.setFigure(new Point(2, 2), Figure.X);
            assertEquals(Figure.X, winnerController.getWinner(field));
    }

    @Test
    public void testGetWhenNoWinnerDiag1() throws Exception {
        final WinnerController winnerController = new WinnerController();

            final Field field = new Field(3);
            field.setFigure(new Point(0, 0), Figure.X);
            field.setFigure(new Point(1, 1), Figure.X);
            field.setFigure(new Point(2, 2), Figure.O);
            assertNull(winnerController.getWinner(field));
    }

    @Test
    public void testGetWhenWinnerDiag2() throws Exception {
        final WinnerController winnerController = new WinnerController();

            final Field field = new Field(3);
            field.setFigure(new Point(0, 2), Figure.X);
            field.setFigure(new Point(1, 1), Figure.X);
            field.setFigure(new Point(2, 0), Figure.X);
            assertEquals(Figure.X, winnerController.getWinner(field));
    }

    @Test
    public void testGetWhenNoWinnerDiag2() throws Exception {
        final WinnerController winnerController = new WinnerController();

            final Field field = new Field(3);
            field.setFigure(new Point(0, 2), Figure.X);
            field.setFigure(new Point(1, 1), Figure.X);
            field.setFigure(new Point(2, 0), Figure.O);
            assertNull(winnerController.getWinner(field));
    }

    @Test
    public void testGetWhenNoWinnerRow2() throws Exception {
        final WinnerController winnerController = new WinnerController();

            final Field field = new Field(3);
            field.setFigure(new Point(0, 2), Figure.O);
            field.setFigure(new Point(1, 1), Figure.X);
            field.setFigure(new Point(2, 0), Figure.X);
            assertNull(winnerController.getWinner(field));
    }
}
