/* 
Functions = block of code, reuseable .

//Syntax

returnType name(){      //returnType tell us the type of output

    //body
    return statements;
}

******example:-*****

public static void nameOfFunction()
{
    System.out.println("hello");

    // if return type is void, then only write
    return;

    //if return type is int ,write return with how many int values
    return x;
}

// then comes main function
public static void main(String args[])
{
    //we can call our function here
    nameOfFunction();       //function calling
}

*/

public class FunctionBasics {
    // function
    public static void printHelloWorld() {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

        return; // return type
    }

    public static void main(String args[]) {
        // function call
        printHelloWorld();
    }

}