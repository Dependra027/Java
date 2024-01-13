public class Break {
    public static void main(String args[]){

        // break is used to exit the loop or program
        for(int i=1;i<=5;i++)
        {
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
    }

}
