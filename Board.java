public class Board{
    private static int size = 3;
    // private static boolean isValidMove(int row, int col);
    // private static boolean isFull(int[][] board){};

    public static void main(String[] args) {

        String[][] Game_Board = new String[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                Game_Board[i][j] = String.format("%d%d", i,j);
            }
        }
        Print_Board(Game_Board, size);

        // Change made in Board branch

        




        
    }


    static private void Print_Board(String[][] board, int size){// function to print the Board
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                
                System.out.print(board[i][j]+ "   ");
            }
            System.out.print("\n\n");

        }
    }


    static private void Log_Symbol(String[][] board, int size, String position, Symbol Symbol){
        
        int row = position.charAt(0);
        int column = position.charAt(1);

        board[row][column] = Symbol;
        

    }

    
}