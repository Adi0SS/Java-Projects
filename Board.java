public class Board{
    private static int size = 3;
    public static void main(String[] args) {

        String[][] Game_Board = new String[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                Game_Board[i][j] = String.format("%d%d", i,j);
            }
        }
        Print_Board(Game_Board, size);

        




        
    }

    static private void Print_Board(String[][] board, int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                
                System.out.print(board[i][j]+ "   ");
            }
            System.out.print("\n\n");

        }
    }
}