package CompletedAssignment.TicTacToe;

import static CompletedAssignment.TicTacToe.Position.O;
import static CompletedAssignment.TicTacToe.Position.X;

public class Players {
    private String player1Name;
    private String player2Name;
    private Position playerOne;

    public Players() {}
    public Players(String player1Name , String player2Name){
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getPlayer1Name() {
        return player1Name;
    }
    public String getPlayer2Name() {
        return player2Name;
    }
    public Position player2() {
        return O;
    }
    public Position player1() {
        return X;
    }
}
