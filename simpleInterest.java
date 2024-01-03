import java.util.Scanner;

public class simpleInterest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int Rate = sc.nextInt();
        int Time = sc.nextInt();

        int SI = (principal * Rate * Time) / 100;
        System.out.println(SI);
    }

}
