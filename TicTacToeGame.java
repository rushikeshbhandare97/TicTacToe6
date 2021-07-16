public class TicTacToeGame {



        public  static char[]  CreateBoard() {

        char []  board = new char[10];

        for(int i=0;  i<board.length ; i++) {

        board[i] = ' ';

        }
        return board;
        }
      

       public static void main(String[] args) {
      
          System.out.println("Welcome to Tic tac Toe Game");
          char[] board =CreateBoard();

       }

   }

