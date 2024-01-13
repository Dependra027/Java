
// Display all number entered by user except multiples of 10
import java.util.*;

public class problem1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

}
