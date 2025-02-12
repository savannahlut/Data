public class Data
{
    public static final int MAX = 30  /* value not shown, 30 test value */;
    private int[][] grid;
    private int x;
    private int y;

    /** Fills all elements of grid with randomly generated values, as described in part (a)
    * Precondition: grid is not null.
    * grid has at least one element.
    */
    public void repopulate()
    {
        for(int i = 0; i < grid.length; i++){
            for(int x = 0; x < grid.length; x++){
                int r = (int)((Math.random() * MAX) + 1);
                while(r % 10 != 0 || r % 100 == 0){
                    r = (int)((Math.random() * MAX) + 1);
                } 
                grid[i][x] = r;
            }
        }
    }

    /** Returns the number of columns in grid that are in increasing order, as described
    * in part (b)
    * Precondition: grid is not null.
    * grid has at least one element.
    */
    public int countIncreasingCols()
    {
        int count = 0; 
        for (int i = 0; i<x; i++){
            boolean increasing = true;
            for (int j = 1; j<y; j++){
                if(grid[j-1][i] > grid[j][i])
                    increasing = false;
            } if(increasing) count++;
        }
        return count;
    }
    // There may be instance variables, constructors, and methods that are not shown.

    public int[][] getGrid(){
        for (int i = 0; i<y; i++){
            for (int j = 0; j<x; j++){
            System.out.print(grid[i][j] + " ");
            } 
            System.out.println();
        }
        return grid;
    }

    public Data(int x, int y){
        this.x = x;
        this.y = y;
        grid = new int[x][y];
    }

    public Data(int[][] setter){
        grid = setter; 
        x = setter[0].length;
        y = setter.length;
    }

    //i coulda used toString to print the grid but like i forgor...
}