// to find largest or smallest of the array ,we will take a variable largest=-infinity i.e Integer.MIN_VALUE.   +infinity is Integer.MAX_VALUE

public class LargestOfArray {
    public static int largest(int a[]) {
        int largest = Integer.MIN_VALUE; // -infinty-> min value in numbers
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {

                largest = a[i]; // if largest is small , hen we will update it with that number
            }

            // we can find smallest
            if (a[i] < smallest) {
                smallest = a[i];
            }

        }
        System.out.println("smaleest value is " + smallest);
        return largest;

    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 5, 7, 8, 2 };
        System.out.println("Largest number is " + largest(a));
    }

}
