
// write aprogram that reads a set of integers, and then prints the sum of the even and odd integer
import java.util.*;

public class problem2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter the number");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("Do you want continue? Press 1 for yes or 0 for no");

            choice = sc.nextInt(); // for input of choices

        } while (choice == 1);

        System.out.println("Sum of even numbers:" + evenSum);
        System.out.println("Sum of odd numbers:" + oddSum);

    }

}
