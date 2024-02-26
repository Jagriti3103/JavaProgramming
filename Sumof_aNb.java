import java.util.*;

public class Sumof_aNb{

    public static void main(String arg[]){
        System.out.println("Sum Of Two Numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= sc.nextLine();   //nextLine helps print string of characters including spaces.
        System.out.println("Hello "+ name);
        
        //Input for a and b:
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The Sum is:");
        System.err.print(sum);
    sc.close();
}

}