import java.util.*;
public class InitializeMinesweeper{
    int n;
    int[][] grid;
    boolean[][] visitedGrid;
    int bombPlaced = -1;
    InitializeMinesweeper(int n){
        this.n = n;

        grid = new int[n][n];
        visitedGrid = new boolean[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = 0;
                visitedGrid[i][j] = false;
            }
        }
    }
    InitializeMinesweeper(){
        super();
    }
    Scanner scan = new Scanner(System.in);
    
    public void initializeGrid(int numberOfBombs){
        grid = new int[n][n];
        visitedGrid = new boolean[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = 0;
                visitedGrid[i][j] = false;
            }
        }
        initializeBombs(numberOfBombs);
        initializeRestGrid();
    }
    public void initializeBombs(int numberOfBombs){
        for(int bomb=0; bomb<numberOfBombs; ++bomb){
            System.out.println("enter row and column coordinates for bomb: ");
            int bombRow = scan.nextInt();
            int bombCol = scan.nextInt();
            while(!isPlacedBomb(bombRow, bombCol)){
                bombRow = scan.nextInt();
                bombCol = scan.nextInt();
            }
        }
    }
    public boolean isPlacedBomb(int bombRow, int bombCol){
        if(grid[bombRow][bombCol]==bombPlaced)
            return false;
        else{
            grid[bombRow][bombCol]=bombPlaced;
            return true;
        }
    }
    public boolean isBombThere(int row, int col){
        System.out.println(row+"  "+col);
        if(grid[row][col]==bombPlaced)
            return true;
        else 
            return false;
    }
    public void initializeRestGrid(){
        for(int row=0; row<n; ++row){
            for(int col=0; col<n; ++col){
                int count=0;
                if(grid[row][col]!=-1){
                    count = getAdjacentBombCount(row, col);
                    grid[row][col] = count;
                }
            }
        }
    }
    int getAdjacentBombCount(int row, int col){
        int count=0;
        if(row==0 && col==0){
            if(grid[row+1][col]==bombPlaced)
                count = count+1;
            if(grid[row][col+1]==bombPlaced)
                count = count+1;
            if(grid[row+1][col+1]==bombPlaced)
                count = count+1;    
        }
        else if(row==0 && col==n-1){
            if(grid[row][col-1]==bombPlaced)
                count = count+1;
            if(grid[row+1][col-1]==bombPlaced)
                count = count+1;
            if(grid[row+1][col]==bombPlaced)
                count = count+1;
        }
        else if(row==n-1 && col==0){
            if(grid[row-1][col]==bombPlaced)
                count = count+1;
            if(grid[row-1][col+1]==bombPlaced)
                count = count+1;
            if(grid[row][col+1]==bombPlaced)
                count = count+1;
        }
        else if(row==n-1 && col==n-1){
            if(grid[row-1][col]==bombPlaced)
                count = count+1;
            if(grid[row-1][col-1]==bombPlaced)
                count = count+1;
            if(grid[row][col-1]==bombPlaced)
                count = count+1;
        }
        else if(row==0){        //top row
            if(grid[row][col-1]==bombPlaced)
                count = count+1;
            if(grid[row][col+1]==bombPlaced)
                count = count+1;
            if(grid[row+1][col-1]==bombPlaced)
                count = count+1;
            if(grid[row+1][col]==bombPlaced)
                count = count+1;
            if(grid[row+1][col+1]==bombPlaced)
                count = count+1;
        }
        else if(row==n-1){        //bottom row
            if(grid[row][col-1]==bombPlaced)
                count = count+1;
            if(grid[row][col+1]==bombPlaced)
                count = count+1;
            if(grid[row-1][col-1]==bombPlaced)
                count = count+1;
            if(grid[row-1][col]==bombPlaced)
                count = count+1;
            if(grid[row-1][col+1]==bombPlaced)
                count = count+1;
        }
        else if(col==0){        //left column
            if(grid[row-1][col]==bombPlaced)
                count = count+1;
            if(grid[row+1][col]==bombPlaced)
                count = count+1;
            if(grid[row-1][col+1]==bombPlaced)
                count = count+1;
            if(grid[row][col+1]==bombPlaced)
                count = count+1;
            if(grid[row+1][col+1]==bombPlaced)
                count = count+1;
        }
        else if(col==n-1){        //right column
            if(grid[row-1][col]==bombPlaced)
                count = count+1;
            if(grid[row+1][col]==bombPlaced)
                count = count+1;
            if(grid[row-1][col-1]==bombPlaced)
                count = count+1;
            if(grid[row][col-1]==bombPlaced)
                count = count+1;
            if(grid[row+1][col-1]==bombPlaced)
                count = count+1;
        }
        else{
            if(grid[row-1][col-1]==bombPlaced)
                count = count+1;
            if(grid[row-1][col]==bombPlaced)
                count = count+1;
            if(grid[row-1][col+1]==bombPlaced)
                count = count+1;
            if(grid[row][col-1]==bombPlaced)
                count = count+1;
            if(grid[row][col+1]==bombPlaced)
                count = count+1;
            if(grid[row+1][col-1]==bombPlaced)
                count = count+1;
            if(grid[row+1][col]==bombPlaced)
                count = count+1;
            if(grid[row+1][col+1]==bombPlaced)
                count = count+1;
        }
        return count;
    }
    public void printGrid(){
        for(int row=0; row<n; ++row){
            for(int col=0; col<n; ++col)
                System.out.print(grid[row][col]+"    ");
            System.out.println();
        }
    }
    public void unlockVisitedGrid(int row, int col){
        visitedGrid[row][col] = true;
    }
    public void printAloneGrid(int row, int col){
        unlockVisitedGrid(row, col);
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                if(visitedGrid[i][j]==true){
                    System.out.print(grid[i][j]+"  ");
                }
                else{
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    
}