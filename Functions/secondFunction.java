package Functions;

import java.util.*;

public class secondFunction {
  public static int calculateSum(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the first number");
    int a = obj.nextInt();
    System.out.println("enetr the second number");
    int b = obj.nextInt();

    int sum = calculateSum(a, b);
    System.out.println("sum of 2 number is :" + sum);
  }
}
