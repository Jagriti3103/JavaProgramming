import java.util.*;

public class AreaOfCircle {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Area Of a Circle");
        System.out.println("Enter the Radius:");
        float r = sc.nextFloat();
        double Area = 3.14*r*r;
        System.out.println("Area of the circle is:");
        System.out.println(Area);
        sc.close();
    }
    
}
