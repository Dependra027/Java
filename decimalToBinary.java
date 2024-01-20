/*
decimal to binary conversion
*logic->
       
  while(n>0)
  1. divide by 2,and get remainder
   
    let final number be bin so

    bin=bin+remainder*10^power;

    then increaase power, pow++
    then we need to deal with other digit-> n=n/2;

 */

public class decimalToBinary {

    public static void decTobin(int n) {
        int bin = 0;
        int pow = 0;
        int myNum = n;

        while (n > 0) {
            int rem = n % 2;
            bin = bin + rem * (int) Math.pow(10, pow);
            pow++;
            n = n / 2;

        }
        System.out.println("Binary of " + myNum + " = " + bin);

    }

    public static void main(String args[]) {
        decTobin(10);
    }

}
