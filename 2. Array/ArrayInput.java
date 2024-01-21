// taking input array
import java.util.*;
public class ArrayInput {

    public static void main(String args[])
    {
        //declare
        int marks[]=new int[100];

        //to find the length of the array we use .length 
        System.out.println("length of array= "+marks.length);

        //for taking input
        Scanner sc=new Scanner(System.in);
        
        marks[0]=sc.nextInt(); // maths
        marks[1]=sc.nextInt(); // physics
        marks[2]=sc.nextInt(); // chemistry

        //printing array
        System.out.println("Maths: "+ marks[0]);
        System.out.println("Physics: "+ marks[1]);
        System.out.println("chemistry: "+ marks[2]);

        //we can make changes in array
        marks[2]=100;

        marks[1]=marks[2]+1;
        System.out.println("physics updated: "+marks[1]);

        //lets find the percentage
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage: "+percentage+" %");

    }
}