package loc.staproject.xo.model;

import loc.staproject.xo.model.exceptions.InvalidePointException;

public class Field {

    private static final int MIN_COORDINATE = 0;
    
    private final int fieldSize;
    
    private final Figure[][] field;

    public Field(final int fieldSize) {
        this.fieldSize = fieldSize;
        field = new Figure[fieldSize][fieldSize];
    }

    public int getSize() {
        return fieldSize;
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidePointException {
        if (!checkPoint(point)) {
            throw new InvalidePointException();
        }

        field[point.getX()][point.getY()] = figure;
    }

    public Figure getFigure(final Point point) throws InvalidePointException {
        if (!checkPoint(point)) {
            throw new InvalidePointException();
        }

        return field[point.getX()][point.getY()];
    }

    private boolean checkPoint(final Point point) {
        return checkCoordinate(point.getX(), field.length) && 
            checkCoordinate(point.getY(), field[point.getX()].length);
    }

    private boolean checkCoordinate(final int coordinate, final int maxCoordinate) {
        return coordinate >= MIN_COORDINATE && coordinate < maxCoordinate;
    } 
}
