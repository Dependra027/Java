
// check if number is prime or not
import java.util.*;

public class PrintPrimeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true; // let initially number is prime
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) // n is multiple of i (i nor equal to 1 or n)
            {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("n is prime");
        } else {
            System.out.println("not prime");
        }
    }

}
