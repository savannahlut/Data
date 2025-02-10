public class Main {

    public static void main(String[] args) {
        Data D = new Data(5, 5);
        D.repopulate();
        System.out.println(D.getGrid());
    }
}