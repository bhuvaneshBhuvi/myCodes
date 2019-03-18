import java.util.Scanner;
public class GameInterface{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        boolean shallPlay=true;
        while(shallPlay==true){
            int n = 9;
            InitializeMinesweeper initializeObject = new InitializeMinesweeper();
    //        MineGame mineObj = new MineGame(n);
            System.out.println("enter number of bombs to be placed: ");
            int numberOfbombs = scan.nextInt();
            initializeObject.initializeGrid(numberOfbombs);
            initializeObject.printGrid();
    //        mineObj.initializeGrid(numberOfbombs);
    //        mineObj.printGrid();
            int row=0, col=0;
            PlayGame gameObject = new PlayGame();
            gameObject.playGame();
    //        mineObj.playGame();
            System.out.println("continue game? 1 or 0 ");
            if(scan.nextInt()==0)
                shallPlay=false;
        }
        scan.close();
    }
}