package week09;

import java.util.Arrays;

public class tiTacToc {
    public static void main(String[] args) {

        char[][] board = {{'0', '_','_'},
                          {'x','0','x'},
                          {'_','x','0'}
        };

        String winner = "";

        for (int i = 0; i < board.length; i++) {
         String row = Arrays.toString(board[i]).replace(",","").replace("[","").replace("]","");

         String colm = "" + board[0][i] + board[1][i]+ board[2][i];

         if(row.equalsIgnoreCase("xxx") || colm.equalsIgnoreCase("xxx")){
             winner = "x";

         }else if(row.equalsIgnoreCase("ooo")|| colm.equalsIgnoreCase("ooo")){
             winner = "o";
         }

        }
        String dig1 = "" + board[0][0] + board[1][1] +board[2][2];
        String dig2 = "" + board[2][0] + board[1][0] +board[0][2];

        if(dig1.equals("xxx") || dig2.equals("xxx")){
            winner = "x";

        }else if(dig1.equals("ooo") || dig2.equals("000")){
            winner = "o";

        }

        if(winner.isEmpty()){
            System.out.println("tie");
        }else{
            System.out.println("player wins");
        }


    }


}
/*

T1TicTacToe [multidimensional array]

    Create a program that will define a 2D array for a tic tac toe game. Check the board to see who won.
    X or O are the winners if they have 3 of the same character in a row. If there is not 3 X or O in a row print Tie instead
 */
