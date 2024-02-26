import java.util.*;

public class Productof_TwoNumbers {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Product of Two Numbers");
        System.out.println("Enter Two Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println("Product of the Two numbers is: ");
        System.out.println(product);
        sc.close();
    }
}
