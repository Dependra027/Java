public class Problem{
    public static int fact(int n)
    {
        int f=1;

        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f; //foctorial of n
    }

// problem2=  lets also write function for binomial expansion  nCr= n!/r!(n-r)!

    public static int binomial(int n, int r){
        int factorial_n=fact(n);
        int factorial_r=fact(r);
        int factorial_nmr=fact(n-r);
        int binCoeff= factorial_n/(factorial_nmr*factorial_r);

        return binCoeff;

    }
    public static void main(String argd[])
    {
        System.out.println(fact(4));
        System.out.println();
        System.out.println("binomial = "+binomial(5,2));
    }
}