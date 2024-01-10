public class ReverseOfNumber {

    public static void main(String args[]) {
        // to remove the last digit of any number , divide it with 10
        // to get the last digit of any number, take its remainder

        int n = 10899;

        while (n > 0) {
            int lastDigit = n % 10; // to get last number
            System.out.print(lastDigit);
            n = n / 10;
        }
        System.out.println();

    }
}