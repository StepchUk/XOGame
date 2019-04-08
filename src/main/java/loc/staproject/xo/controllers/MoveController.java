package loc.staproject.xo.controllers;

import loc.staproject.xo.model.Field;
import loc.staproject.xo.model.Figure;
import loc.staproject.xo.model.Point;
import loc.staproject.xo.model.exceptions.AlreadyOccupaiedException;
import loc.staproject.xo.model.exceptions.InvalidePointException;

public class MoveController {

    public void applyFigure(final Field field, 
                            final Point point, 
                            final Figure figure) throws InvalidePointException, AlreadyOccupaiedException {
        if (field.getFigure(point) != null)  {
            throw new AlreadyOccupaiedException();
        }

        field.setFigure(point, figure);
    }
}
