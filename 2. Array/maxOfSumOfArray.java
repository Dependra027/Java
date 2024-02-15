
public class SumOfSubarrays {
    public static void Sa(int arr[]) {
        int currSize = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                currSize = 0;
                int end = j;

                for (int k = start; k <= end; k++) {

                    currSize += arr[k];

                }
                System.out.print(currSize + " ");

            }
            System.out.println();

        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Sa(arr);
    }
}
