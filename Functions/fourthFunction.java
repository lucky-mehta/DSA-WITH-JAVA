package Functions;

import java.util.Scanner;

public class fourthFunction {
  public static void calculateFactorial(int n) {
    if (n < 0) {
      System.out.println("Invalid Number");
      return;
    }

    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    System.out.println(fact);
    return;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the any number:");
    int n = obj.nextInt();
    calculateFactorial(n);

  }
}
