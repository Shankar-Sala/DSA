// Qs.1 Sum of a & b

// import java.util.*;
// public class Question{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Number A: ");
//     int a = sc.nextInt();
//     System.out.print("Enter Number B: ");
//     int b = sc.nextInt();
//     int sum = a+b;
//     System.out.println("Sum of A & B = "+sum);
//   }
// }

// Qs.1 Area of Circle
/*formula 
Area of Circle = pi*r^2
Area of Rectangle = Length * Breadth
Area Of Square = Side * Side
Area of Triangle = 1/2 * base * height */

import java.util.*;

public class Question{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float rad = sc.nextFloat();
    // if we write f after decimal value then it convert to float else it will double
    float area = 3.14f * rad * rad;
    System.out.print("Area of Circle = " + area);
  }
}
