import java.util.*;

public class PassAndFail {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        // terrnery
        String decision = (marks >= 33) ? "Pass" : "Fail";

        System.out.println(decision);
    }
}
