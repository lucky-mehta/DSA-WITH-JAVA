// Q2. WRITE A FUNCTION TO PRINT THE SUM OF ALL ODD NUMBER FROM 1 TO N.

import java.util.Scanner;

public class sumOfNnumber {
  public static int calculateSumOfOdd(int n) {
    int i = 1;
    int s = 0;
    while (i <= n) {
      s = s + i;
      i = i + 2;
    }
    return s;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the limit of series:");
    int n = obj.nextInt();
    int s = calculateSumOfOdd(n);
    System.out.println("sum of n odd number is:" + s);
  }
}
