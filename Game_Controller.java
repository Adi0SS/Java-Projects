import java.util.Scanner;


public class Game_Controller {
    private static Board T_Board = new Board();
    public static final char Cross = 'X';
    public static final char Zero = 'O';



private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String position;
        T_Board.Reset_Board();
        
        // LOOP ahead ----------------------

        while(true){
        T_Board.Print_Board();

        System.out.print("Enter the position: ");

        position = sc.next();// get position to enter the mark
        System.out.print("\n");
        T_Board.Log_Symbol(position, Board.get_Symbol());
        T_Board.Print_Board();
        if(T_Board.isWinner()){
            Board.Get_Winner();
            break;
        }
        Board.Change_Symbol();
        if(Board.isFull()){
            System.out.println("It's a Draw");
            break;
        }
  
        }
        
        

    }


}