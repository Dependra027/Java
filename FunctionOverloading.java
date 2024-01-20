// Function overloading= multiple functions with the same name but different parameters.
//Function overloading doesnot depend upon return type ,it only depend on parameters

//* using parameters

public class FunctionOverloading {

    // func to calc sum of 2 nums
    public static int sum(int a, int b) {
        return a + b;
    }

    // func to calc sum of 3 nums
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // * using Data types

    // func to calc int sum
    public static int add(int a, int b) {
        return a + b;
    }

    // func to calc to float sum
    public static float add(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {

        System.out.println(sum(3, 5)); // function calling
        System.out.println(sum(3, 4, 5));

        System.out.println();

        System.out.println(add(3, 5));
        System.out.println(add(3.2f, 4.8f));
    }

}
