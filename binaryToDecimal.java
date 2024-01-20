/*
  let we have binary number =101
  * logic-> 
  we will take three terms= Decimal,power,lastdigit

  1. for starting dec=0, pow=0 and LD=1

        dec= dec + [Ld*2^pow]
           = 0   + [1*2^0]  = 0+1=1

           number ko chotta krdena= 101->01

  2. now dec=1, power=1 and ld=0

        dec=dec + [ld*2^pow]
           = 1  + [0*2^1 ]

           number chota krdena =01->1

  3. now dec=1 ,pow=2, ld=1
      
        dec = dec+ [ld*2^pow]
            = 1 + [1*2^2]
 */

public class binaryToDecimal {
      public static void binTodec(int binNum) {
            int myNum = binNum;
            int pow = 0;
            int decNum = 0;

            while (binNum > 0) {
                  int lastDigit = binNum % 10; // to find last digit

                  decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
                  pow++;
                  binNum = binNum / 10; // to make number small
            }
            System.out.println("decimal of " + myNum + " = " + decNum);
      }

      public static void main(String args[]) {
            binTodec(101);
      }

}
