//Print thefibonacci sequence till nth term.
package RECURSION;

import java.util.Scanner;

public class recursionSix {
  public static void printFib(int a, int b, int n) {
    if (n == 0) {
      return;
    }
    int c = a + b;
    System.out.println(c);
    printFib(b, c, n - 1);
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the limit of series:");
    int n = obj.nextInt();
    int a = 0, b = 1;
    System.out.println(a);
    System.out.println(b);
    printFib(a, b, n - 2);
  }
}
