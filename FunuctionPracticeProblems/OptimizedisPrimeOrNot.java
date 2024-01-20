//*This is an optimized approach for finding no. is prime or not
// we will use i=2 to i<=sqrt(n)
 
public class optimizedPrime {

    public static boolean isprime(int n)
    {
        // corner case
        if(n==2)
        {
            return true;   // if user takes 2 as input this loop return true, then will not go to the for loop
        }
        for(int i=2;i<=Math.sqrt(n);i++)   // to write sqrt we use math library Math.sqrt()
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    // Problem2= print all prime number for range n
    public static void PrintPrime(int r)
    {
        for(int i=2;i<=r;i++)
        {
            if(isprime(i))
            {
                // if true
                System.out.print(i+"  ");
            }
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        System.out.println(isprime(2));
        System.out.println(isprime(5));

        System.out.println();
       PrintPrime(10); // 2 to 20
    }
    
}
