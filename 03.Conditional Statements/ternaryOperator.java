import java.util.*;

public class ternaryOperator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = 5;
    String type = ((number%2 == 0))?"Even":"Odd";
    System.out.println(type);
  }
}