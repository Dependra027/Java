// ternery operator synatax= varaiable=condition?statement1:statement2;
// statement1 and statement refers to true and false. And ':' refers to or.

import java.util.*;

public class TerneryOperator {
    public static void main(String args[]) {

        int a = 3;

        // terrnery operator
        String type = ((a % 2) == 0) ? "even" : "odd";

        System.out.println(type);
    }

}
