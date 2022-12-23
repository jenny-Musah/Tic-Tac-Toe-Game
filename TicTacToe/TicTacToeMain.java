package CompletedAssignment.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToeMain {
    public static Players players = new Players();
    public static   TicTacToeBoard board = new TicTacToeBoard();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        beginning();
    }
    public static void beginning() {
        System.out.println("Welcome to TicTacToe City Game");
        System.out.println("Enter \"1\" to play\nEnter \"0\"  to Exit game");
        if (inputValidation() == 1) {
            playerNames();
            play();
        }
    }
    public static int inputValidation() {
        int number = 0;
        try {
            number = input.nextInt();
            return number;
        } catch (InputMismatchException e) {
            System.out.println("Enter number Only!");
        }
        return number;
    }
    public static void playerNames() {
        input.nextLine();
        String name1;
        String name2;
        System.out.println("Enter player one name:");
        name1 = input.nextLine();
        System.out.println("Enter player two name:");
        name2 = input.nextLine();
        players = new Players(name1, name2);
        System.out.printf("%s is X%n%n%s is O%n%n",players.getPlayer1Name(),players.getPlayer2Name());
    }
    public static void play() {
        board.displayBoard();
        for (int i = 0; i < 5 ; i++) {
                   if(!(board.validateWinner())) playerOne();if(i == 4)break;
                   else if (!(board.validateWinner())) playerTwo();
                   else {
                       break;
            }
        }
    }
    public static void  playerTwo(){
      int number = collectInput(players.getPlayer2Name());
        setValue(number,players.player2());
    }
    public static void playerOne(){
       int number = collectInput(players.getPlayer1Name());
            setValue(number,players.player1());
    }
    public static int collectInput( String name) {
        System.out.printf(" %s Enter a number from 1 - 9:%n",name);
      int number = inputValidation();
      return number;

    }
    public static void setValue(int number ,Position obj){
        board.setConstant(number, obj);
        board.displayBoard();
    }
}