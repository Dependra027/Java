//nested loop= loop inside loop
/*

            * lets print
 * 
 * *
 * * *
 * * * *
                                */

public class nestedLoop {
    public static void main(String args[]) {
        // first loop dicides how many lines to print;
        for (int line = 1; line <= 4; line++) {
            // 2nd loop or inner loop dicides how many stars to be printed
            // that is equal to line. for one line one star, for 2line 2 stars
            for (int star = 1; star <= line; star++) {
                System.out.print(" * ");

            }
            System.out.println();// to come to next line
        }
    }

}
