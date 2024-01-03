// Switch statement= when we use many cases, we use switch statements 

import java.util.*;

public class Switch {
    public static void main(String[] args) {
        int a = 2;
        switch (2) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("hello Dependra");
                break;
            // if we dont use break, all the case will print after the required case
            case 3:
                System.out.println("hii");
                break;
            default:
                System.out.println("Radhe Radhe");
                break;
        }
    }

}
