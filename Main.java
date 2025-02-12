public class Main {

    public static void main(String[] args) {
        Data D = new Data(5, 5);
        D.repopulate();
        System.out.println(D.getGrid());

        int[][] slay = 
        {
            {10, 50, 40},
            {20, 40, 20},
            {30, 50, 30}
        };
        Data girlboss = new Data(slay);
        System.out.println(girlboss.getGrid());
        System.out.println(girlboss.countIncreasingCols());

        int[][] bjall = {
            {10, 540, 440, 440},
            {220, 450, 440, 190},
        };
        Data blanchin = new Data(bjall);
        System.out.println(blanchin.getGrid());
        System.out.println(blanchin.countIncreasingCols());
    }
}