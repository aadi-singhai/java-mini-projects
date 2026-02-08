import java.util.Scanner;
public class TicTacToe {
    public static void printBoard(char[][] board){
        System.out.println("Current Board:"); 
        for(int i = 0; i < 3; i++ ){
            for (int j = 0; j < 3; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static boolean checkWinner(char[][] board, char player) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;

            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;

        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        int turn = 0;

        for(int i=0; i<board.length; i++){
            for(int j =0; j < board[i].length; j++){
                board[i][j]='-';
            }
        }
        printBoard(board);
        
        while(turn < 9){
            char currentPlayer = (turn % 2 == 0) ? 'X' : 'O';
            int row, col;

            while(true){

                System.out.print("Player "+ currentPlayer + " enter row(0-2): ");
                row = sc.nextInt();
                System.out.print("Player "+ currentPlayer +" enter coloumn(0-2): ");
                col = sc.nextInt();
                
                
                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("Invalid position. Try again.");
                    continue;
                }
                
                if (board[row][col] != '-') {
                    System.out.println("Cell already occupied. Try again.");
                    continue;
                }
                
                board[row][col] = currentPlayer;
                break;

            }
            printBoard(board);

            if( turn >= 4 && checkWinner(board, currentPlayer)){
                System.out.println("Player " + currentPlayer + " is the winner");
                sc.close();
                return;
            }
            turn++;
        }

        System.out.print("game is a draw.");
        sc.close();
        } 
    }

