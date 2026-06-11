package Functions;

import java.util.*;

public class fifthFunction {
  public static String calculateEvenOdd(int n) {
    if (n % 2 == 0) {
      return "even";
    } else {
      return "odd";
    }
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the any number");
    int n = obj.nextInt();
    System.out.println(calculateEvenOdd(n));
  }
}
