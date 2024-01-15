// Syntax with parameters
/*

           returnType name(type parameter1,type parameter2)
           {
            //body
            return statement;
           }

           //parameters are the inputs
 */

import java.util.*;

public class SyntaxWithParameterOfFunction {

    public static void sum(int a, int b) {
        int add = a + b;
        System.out.println("Sum is= " + add);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sum(a, b);
    }
}