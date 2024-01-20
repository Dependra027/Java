public class primeOrNot {

    public static boolean isprime(int n)
    {
        boolean isprime=true; //assume that our number is prime
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0) //completely divide
            {
                isprime=false;
                break; // as we need to check for only one number
            }
        }
        return isprime;
    }

    public static void main(String args[])
    {
        System.out.println(isprime(6));
    }
    
}
