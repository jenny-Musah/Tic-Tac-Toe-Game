package CompletedTest.TicTacToeTest;

import CompletedAssignment.TicTacToe.Position;
import CompletedAssignment.TicTacToe.TicTacToeBoard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static CompletedAssignment.TicTacToe.Position.*;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    TicTacToeBoard board;

    @BeforeEach
    public void setUp() {
        board = new TicTacToeBoard();
    }

    @Test
    public void testThatIHaveABoard() {
        assertNotNull(board);
    }

    @Test
    public void testThatIHaveAnEmptyBoard() {
        Position[][] expectedBoard = {{E, E, E}, {E, E, E}, {E, E, E}};
        assertArrayEquals(expectedBoard, board.board());
    }
   @Test
    public void testThatICanSetValuesInBoard(){
        Position [] [] expectedBoard = {{X, E,E},{E, E,E},{E, E,E}};
     board.setConstant(1,X);
     assertArrayEquals(expectedBoard, board.board());
    }
    @Test
    public void testThatPlayersCanWinOnLineOne(){
        board.setConstant(1,X);
        board.setConstant(2,X);
        board.setConstant(3,X);
        assertTrue(board.validateWinner());
    }
    @Test
    public void testThatPayerCanWinOnLineTwo(){
        board.setConstant(4,X);
        board.setConstant(5,X);
        board.setConstant(6,X);
        assertTrue(board.validateWinner());
    }
    @Test
    public void testThatPlayerCanWinOnLineThree(){
        board.setConstant(7,O);
        board.setConstant(8,O);
        board.setConstant(9,O);
        assertTrue(board.validateWinner());
    }
    @Test
    public void testThatPlayerCanWinOnLeftLineOfBoard(){
        board.setConstant(1,O);
        board.setConstant(4,O);
        board.setConstant(7,O);
        assertTrue(board.validateWinner());
    }
    @Test
    public void testThatPlayerCanWinOnTheRightLineOfABoard(){
        board.setConstant(3,O);
        board.setConstant(6,O);
        board.setConstant(9,O);
        assertTrue(board.validateWinner());
    }
    @Test
    public void testThatPlayerCanWinAtTheMiddleLine(){
        board.setConstant(2,O);
        board.setConstant(5,O);
        board.setConstant(8,O);
        assertTrue(board.validateWinner());
    }
    @Test
    public void testThatPlayerCanWinFromTheRightDiagonalLine(){
        board.setConstant(1,O);
        board.setConstant(5,O);
        board.setConstant(9,O);
        assertTrue(board.validateWinner());
    }
    @Test
    public void testThatPlayerCanWinFromTheLeftDiagonalLine(){
        board.setConstant(3,X);
        board.setConstant(5,X);
        board.setConstant(7,X);
        assertTrue(board.validateWinner());
    }
}
