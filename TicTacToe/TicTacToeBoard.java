package CompletedAssignment.TicTacToe;

import java.util.Arrays;
import java.util.InputMismatchException;

import static CompletedAssignment.TicTacToe.Position.*;


public class TicTacToeBoard {
    Players players = new Players();
    Position [] [] board = new Position[3][3];
    public TicTacToeBoard (){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length ; j++) {
                board[i][j] = E;
            }
        }
    }
    public Position [] [] board(){
        return board;
    }
    public void displayBoard(){
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board.length ; j++) {
                System.out.print(board[i][j]);
                System.out.print(" | ");
            }
            System.out.println(" ");
        }
    }

    public void setConstant(int position, Position obj){
        if(position < 0 || position > 9){
            System.out.println("Number out of Range");
        }else {
            int index = position - 1;
            if (board[index / 3][index % 3] == E) {
                board[index / 3][index % 3] = obj;
            } else {
                System.out.println("An element is in this place already, sorry you lost a turn.");
            }
        }
    }
    public boolean validateWinner(){
      if(lineOneCheck() |
        lineTwoCheck() |
        lineThreeCheck() |
        leftLineCheck() |
        rightLineCheck() |
        middleLineCheck() |
        diagonalLineCheck() |
        secondDiagonalLineCheck()){
          System.out.println("\nGame over!");
          return true;
        }
    return false;
    }
    public boolean lineOneCheck() {
        if (board[0][0] == X && board[0][1] == X && board[0][2] == X) {
            System.out.print("Player one has won this game");
            return true;
        } else if (board[0][0] == O && board[0][1] == O && board[0][2] == O) {
            System.out.print("Player two has won this game");
            return true;
        }
        return false;
    }
        public boolean lineTwoCheck(){
            if (board[1][0] == X && board[1][1] == X && board[1][2] == X) {
                System.out.print("Player one has won this game");
                return true;
            } else if (board[1][0] == O && board[1][1] == O && board[1][2] == O) {
                System.out.print("Player two has won this game");
                return true;
            }
            return false;
        }
        public boolean lineThreeCheck(){
            if (board[2][0] == X && board[2][1] == X && board[2][2] == X) {
                System.out.print("Player one has won this game");
                return true;
            } else if (board[2][0] == O && board[2][1] == O && board[2][2] == O) {
                System.out.print("Player two has won this game");
                return true;
            }
            return false;
        }
        public boolean leftLineCheck() {
            if (board[0][0] == X && board[1][0] == X && board[2][0] == X) {
                System.out.print("Player one has won this game");
                return true;
            } else if (board[0][0] == O && board[1][0] == O && board[2][0] == O) {
                System.out.print("Player two has won this game");
                return true;
            }
            return false;
        }
        public boolean middleLineCheck() {
            if (board[0][1] == X && board[1][1] == X && board[2][1] == X) {
                System.out.print("Player one has won this game");
                return true;
            } else if (board[0][1] == O && board[1][1] == O && board[2][1] == O) {
                System.out.print("Player two has won this game");
                return true;
            }
            return false;
        }
        public boolean rightLineCheck() {
            if (board[0][2] == X && board[1][2] == X && board[2][2] == X) {
                System.out.print("Player one has won this game");
                return true;
            } else if (board[0][2] == O && board[1][2] == O && board[2][2] == O) {
                System.out.print("Player two has won this game");
                return true;
            }
            return false;
        }
        public boolean diagonalLineCheck() {
            if (board[0][0] == X && board[1][1] == X && board[2][2] == X) {
                System.out.print("Player one has won this game");
                return true;
            }else if (board[0][0] == O && board[1][1] == O && board[2][2] == O) {
                System.out.print("Player two has won this game");
                return true;
            }
            return false;
        }
        public boolean secondDiagonalLineCheck(){
                if (board[0][2] == X && board[1][1] == X && board[2][0] == X) {
                    System.out.print("Player one has won this game");
                    return true;
                } else if (board[0][2] == O && board[1][1] == O && board[2][0] == O) {
                    System.out.print("Player two has won this game");
                    return true;
                }
                return false;
        }
}
;