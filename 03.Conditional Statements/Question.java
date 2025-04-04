//? if else Statement
//*Print the largest of 2 numbers

// import java.util.*;

// public class Question{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Number A: ");
//     int A = sc.nextInt();
//     System.out.print("Enter Number B: ");
//     int B = sc.nextInt();

//     if(A>B){
//       System.out.print("Number A is Largest : "+ A);
//     }
//     else{
//         System.out.print("Number B is Largest : "+ B);
//     }
//   }
// }

// * Print if a number is odd or Even
// import java.util.*;

// public class Question{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Your Number: ");
//     int a = sc.nextInt();
//     if( a % 2 == 0){
//       System.out.println("Even");
//     }
//     else{
//       System.out.println("Odd");
//     }
//   }
// }


//? else if Statement
// import java.util.*;

// public class Question{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter you age: ");
//     int Age = sc.nextInt();

//     if(Age >= 18){
//       System.out.print("Adult");
//     }
//     else if(Age >= 13 && Age < 18){
//       System.out.print("teenager");
//     }
//     else{
//       System.out.print("Child");
//     }
//   }
// }

// * Income Tax Calculator

// import java.util.*;

// public class Question{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Your Income : ");
//     int income = sc.nextInt();
//     int tax;

//     if(income < 500000){
//       tax = 0;
//       System.out.print("Income less than 5L:  0% tax = "+ tax);
//     }
//     else if(income >= 500000 && income < 1000000){
//       tax = (int)(income * 0.20);
//       System.out.print("income between (5L-10L): 20% tax = "+ tax);
//     }
//     else{
//       tax = (int) (income * 0.30);
//       System.out.print("above 10L income: 30% tax = "+ tax);
//     }
//   }
// }


// * Print the largest of 3

// import java.util.*;

// public class Question{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Number A : ");
//     int A = sc.nextInt();
//      System.out.print("Enter Number B : ");
//     int B = sc.nextInt();
//      System.out.print("Enter Number C : ");
//     int C = sc.nextInt();

//     if((A >= B) && (A>= C) ){
//       System.out.print("A is largest Number: "+ A);
//     }
//     else if(B >= C){
//       System.out.print("B is the largest Number: "+B);
//     }
//     else{
//       System.out.print("C is the largest Number: "+C);
//     }
//   }
// }


// * Check if a student will Pass or Fail
//? marks >= 33: Pass
//? marks < 33 : Fail

// import java.util.*;

// public class Question{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Your Number : ");
//     int marks = sc.nextInt();
//     String result = (marks >= 33)?"Pass":"Fail";
//     System.out.println(result);
//   }
// }

// *Create a Calculator 

import java.util.*;

public class Question{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number A: ");
    int A = sc.nextInt();
    System.out.print("Enter Number B: ");
    int B = sc.nextInt();
    System.out.print("Enter Operator: ");
    char operator = sc.next().charAt(0);

    switch(operator){

      case '+':System.out.print("Sum of A & B : "+ (A+B));
                 break;
      case '-':System.out.print("Sub of A & B : "+ (A-B));
                  break;
      case '*':System.out.print("Mul of A & B : "+ (A*B));
                   break;
      case '/':System.out.print("Div of A & B : "+ (A/B));
                   break;
      case '%':System.out.print("Modulo of A & B : "+ (A%B));
                   break;
      default:System.out.print("Wrong Operator");
    }
  }
}