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

import java.util.*;
public class Question{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.print("Sum 0f first n natural numbers: "+sum+".");
        System.out.println();
    }
}