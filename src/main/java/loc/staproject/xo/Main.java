package loc.staproject.xo;

import loc.staproject.xo.model.Field;
import loc.staproject.xo.model.Figure;
import loc.staproject.xo.model.Game;
import loc.staproject.xo.model.Player;
import loc.staproject.xo.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        final String name1 = "Alex";
        final String name2 = "Lexa";

        final Player[] players = new Player[2];
        players[0] = new Player(name1, Figure.X);
        players[1] = new Player(name2, Figure.O);

        final Game gameXO = new Game(players, new Field(3), "XO");

        final ConsoleView consoleView = new ConsoleView();
        consoleView.show(gameXO);
        while(consoleView.move(gameXO)) {
            consoleView.show(gameXO);
        }
    }
}
