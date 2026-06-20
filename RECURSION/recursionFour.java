//Print factorial of a number n.
package RECURSION;

import java.util.Scanner;

public class recursionFour {
  public static void printFactorial(int i, int n, int fact) {
    if (i == n) {
      fact = fact * i;
      System.out.println(fact);
      return;
    }
    fact = fact * i;
    printFactorial(i + 1, n, fact);
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n = obj.nextInt();
    printFactorial(1, n, 1);

  }
}
