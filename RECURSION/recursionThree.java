//PRINT SUM OF FIRST N NATURAL NUMBERS.
package RECURSION;

import java.util.Scanner;

public class recursionThree {

  public static void printSum(int i, int n, int s) {
    if (i == n) {
      s = s + i;
      System.out.println(s);
      return;
    }
    s = s + i;
    printSum(i + 1, n, s);
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the limit of series:");
    int n = obj.nextInt();
    printSum(1, n, 0);

  }

}
