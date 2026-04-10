import javax.security.auth.login.CredentialException;



public class Board{
    public static final char Cross = "X";
    public static final char Zero = "0";

    private static Board board;
    private int size = 3;
    private String[][] Game_Board;

    private Board(){
        if(board == null){
            board = new Board();
            Game_Board = new int[size][size];
        }
    }

    //  public static boolean isFull(int[][] board){};
    // 

    public static void main(String[] args) {


        // Change made in Board branch

        




        
    }

    public void Reset_Board(){

        for(int i=0;i<this.size;i++){
        for(int j=0;j<this.size;j++){
            Game_Board[i][j] = String.format("%d%d", i,j);
            }
        }

    }


    public void Print_Board(){// function to print the Board
        for(int i=0;i<this.size;i++){
            for(int j=0;j<this.size;j++){
                
                System.out.print(this.Game_Board[i][j]+ "   ");
            }
            System.out.print("\n\n");

        }
    }


    public void Log_Symbol(String position, char Symbol){
        
        
        int row = position.charAt(0);
        int column = position.charAt(1);
        if(isValidMove(row, column)){
            this.Game_Board[row][column] = Symbol;

        }


    }

    private boolean isValidMove(int row,int column){
        String current_symbol = Game_Board[row][column];

        if(row< this.size && column < this.size && current_symbol != Cross || current_symbol != Zero){
            return true;
        }
        else return false;

    }

    public boolean isWinner(Player player, char Symbol){
        boolean has_won = false;

        for(int i=0;i<this.size;i++){
            for(int j=0;j<this.size;j++){
                if(this.Game_Board[i][j]==Symbol &&
                    this.Game_Board[i][j]==Symbol &&
                    this.Game_Board[i][j]==Symbol 
                )
                has_won = true;
            }

        }
        for(int i=0;i<this.size;i++){
            for(int j=0;j<this.size;j++){
                if(this.Game_Board[j][i]==Symbol &&
                    this.Game_Board[j][i]==Symbol &&
                    this.Game_Board[j][i]==Symbol 
                )
                has_won = true;
            }

        }

        for(int i=0;i<this.size;i++){
            if(this.Game_Board[i][i] == System) has_won = true;
            else has_won = false;
            }

            return has_won;
        }

    }

    

    
