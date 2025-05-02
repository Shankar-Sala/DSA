//? Print number from 1 to 10
// import java.util.*;
// public class Question{
//     public static void main(String[] args){
//         int counter=1;
//         while(counter <= 10){
//             System.out.print(counter+" ");
//             counter++;
//         }
//     }
// }

//? Print number from 1 to n 
// import java.util.*;

// public class Question {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Your number: ");
//     int range = sc.nextInt();
//     int counter = 1;
//     while (counter <= range) {
//       System.out.print(counter + " ");
//       counter++;
//     }
//     System.out.println();
//   }
// }

//? print sum of first n natural numbers

// import java.util.*;
// public class Question{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number: ");
//         int n = sc.nextInt();
//         int sum = 0;
//         int i = 1;
//         while(i <= n){
//             sum += i;
//             i++;
//         }
//         System.out.print("Sum 0f first n natural numbers: "+sum+".");
//         System.out.println();
//     }
// }

// ? Print Square Pattern

// public class Question {
//    public static void main(String[] args) {
//     for(int line=1; line <= 4; line ++){
//         System.out.println("* * * *");
//     }
//    } 
// }

//? Print Reverse of a number
// public class Question{
//     public static void main(String[] args){
//         int n = 10899;
//         while(n > 0){
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n /= 10;
//         }

//     }
// }

//? Reverse the given number 

// public class Question {

//     public static void main(String[] args) {
//         int n = 10899;
//         int rev = 0;
//         while (n > 0) {
//             int lastDigit = n % 10;
//             rev = (rev * 10) + lastDigit;
//             n /= 10;
//         }
//         System.out.println(rev);
//     }
// }

// ? Keep entering numbers till user enters a multiple of 10.

// import java.util.*;

// public class Question {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.print("Enter your number: ");
//             int n = sc.nextInt();
//             if (n % 10 == 0) {
//                 break;
//             }
//             System.out.println(n);
//         } while (true);
//     }
// }

// ? Display all numbers entered by user except multiples of 10
// use continue statement

// import java.util.*;

// public class Question {
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     do{
//         System.out.print("Enter your number: ");
//         int n = sc.nextInt();

//         if(n % 10 == 0){
//             continue;
//         }
//         System.out.println("number was : " + n);
//     }while(true);
//     }
// }

//? check if a number is prime or not
// prime:2,3,5,7,11 

import java.util.*;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            // for (int i = 2; i <= n - 1; i++) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // n is a multiple of i (i not equal to 1 or n)
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }

    }
}
