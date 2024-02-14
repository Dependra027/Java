public class Subarray {
    public static void Sa(int arr[]) {
        int totalSubarray = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");// subarray print
                    totalSubarray++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of Sub Array: " + totalSubarray);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Sa(arr);
    }
}
