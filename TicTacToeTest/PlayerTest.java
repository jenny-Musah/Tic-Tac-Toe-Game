package CompletedTest.TicTacToeTest;

import CompletedAssignment.TicTacToe.Players;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static CompletedAssignment.TicTacToe.Position.O;
import static CompletedAssignment.TicTacToe.Position.X;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayerTest {
    Players player;
    @BeforeEach
    public void SetupObject(){
        player = new Players("Jennifer","Angela");
    }
    @Test
    public void testThatObjectIsNotEmpty(){
        assertNotNull(player);
    }
    @Test
    public void testThatIHavePlayer1(){
       assertEquals(X,  player.player1());
    }
    @Test
    public void testThatIHavePlayer2(){
        assertEquals(O,player.player2());
    }
}
