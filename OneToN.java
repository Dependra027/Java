import java.util.Scanner;

public class OneToN {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n) {

            System.out.print(counter + " ");
            counter++;

        }

    }

}
