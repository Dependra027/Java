// kadence = it is a method to find the max of sum of sub arrays shortly

public class KadanceSubarray {
    public static void sa(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("maximum of sum is: " + ms);

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, -4, 5, -2, 6 };
        sa(arr);

    }

}
