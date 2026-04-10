// import javax.security.auth.login.CredentialException;
// package Board;

import javax.swing.border.EmptyBorder;

public class Board{
    public static final char Cross = 'X';
    public static final char Zero = 'O';
    private static int size = 3;
    private static char Symbol = 'X';
    private String[][] Game_Board = new String[size][size];
    private static int Empty_space;



    public static void main(String[] args) {


        // Change made in Board branch
        
    }

    public static boolean isFull(){
        if(Empty_space==0) return true;
        else return false;

    }

 public static char get_Symbol(){
    return Symbol;
 }   

    public void Reset_Board(){
        Empty_space = 9;

        for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            this.Game_Board[i][j] = String.format("%d%d", i,j);
            }
        }

    }


    public void Print_Board(){// function to print the Board
        String Line = "==========================================================";
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                
                System.out.print(this.Game_Board[i][j]+ "   ");
            }
            System.out.print("\n\n");

        }
        System.out.println(Line);
    }

    public static void Change_Symbol(){
    if(Symbol == Zero) Symbol = Cross;
    else Symbol = Zero;
}

    public void Log_Symbol(String position, char Symbol){
        
        int row = position.charAt(0)-'0';
        int column = position.charAt(1)-'0';
        if(isValidMove(row, column)){
            this.Game_Board[row][column] = " "+String.valueOf(Symbol);
            Board.Empty_space --;
            // Change_Symbol();
        }


    }
// checks if the entered position by the user is valid or not;
    private boolean isValidMove(int row,int column){
        if(row< size && column < size){
            if(this.Game_Board[row][column].equals(" "+String.valueOf(Cross)) ||
             this.Game_Board[row][column].equals(" "+String.valueOf(Zero)))
              return false;

            else return true;  
        }
        return false;

    }
// the function check for the winning symbol by check if 3 consecutive cells are 0s or Xs;
    public boolean isWinner(){
        String Symbol = " "+String.valueOf(Board.Symbol);

        for(int i=0;i<size;i++){
                if(this.Game_Board[i][0].equals(Symbol) &&
                    this.Game_Board[i][1].equals(Symbol) &&
                    this.Game_Board[i][2].equals(Symbol))
                return true;
            }

        
        for(int i=0;i<size;i++){
                if(this.Game_Board[0][i].equals(Symbol) &&
                    this.Game_Board[1][i].equals(Symbol) &&
                    this.Game_Board[2][i].equals(Symbol)
                )
                return true;
            }
        

        int Diagonal_1 = 0;
        int Diagonal_2 = 0;
        for(int i=0;i<size;i++){
            if(this.Game_Board[i][i].equals(Symbol)) Diagonal_1++;
            }
            if(Diagonal_1 == size) return true;

        for(int i= size-1;i>=0;i--){
            if(this.Game_Board[2-i][i].equals(Symbol)) Diagonal_2++;
        }    
        if(Diagonal_2 == size) return true;

        return false;


        }
    // the function prints the Winning Symbol
    public static void Get_Winner(){
        System.out.printf("The winner is: %c", Board.Symbol);
    }
 
    }

    

    
