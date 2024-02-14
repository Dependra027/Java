public class PairsInArray {

    public static void P(int number[]) {

        int totalPairs = 0;
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];

            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ") ");
                totalPairs++;
            }
            System.out.println();

        }
        System.out.println("Total pairs: " + totalPairs);

    }

    public static void main(String args[]) {
        int number[] = { 1, 2, 3, 4, 5 };
        P(number);

    }
}
