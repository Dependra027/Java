public class CallByValueFunction {

    public static void Swap(int a, int b) {
        // Swapping
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a= " + a);
        System.out.println("b= " + b);

    }

    public static void main(String args[]) {
        // swap-value exchange
        int a = 5;
        int b = 10;
        Swap(a, b); // calling Swap functoin

        // if we try to print a , b here, it will give 5 and 10 as it is not in the wap
        // function.
    }

}

// note= java always use calls by value
