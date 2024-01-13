public class ContinueStatement {
    public static void main(String args[]) {
        // continue is used to skip iteration
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("3 is skipped");

    }

}
