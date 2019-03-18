import java.util.Scanner;

public class PlayGame{
    boolean gameAlive = true;
    InitializeMinesweeper object = new InitializeMinesweeper();
    public void playGame(){
        Scanner scan = new Scanner(System.in);
        while(gameAlive==true){
            System.out.println("enter the row and column coordinates:  ");
            
            int row = scan.nextInt();
            int col = scan.nextInt();
            
            if(object.isBombThere(row, col)){
                gameAlive = false;
                object.printGrid();
                System.out.println("Game Ends!");
                break;
            }
            else{
                object.printAloneGrid(row, col);
            }
        }

    }
}