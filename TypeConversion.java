import java.util.*;

public class TypeConversion {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num for Type Conversion: ");
        float num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }
}

//Type Conversion in Java: also known as Widening Conversion or Implicit Conversion.
// 1.Type Compatible
// 2.destination Type> Source Type

// byte-->short-->int -->float --> long --> double