//Print x'n (Stack Height = logn)

package RECURSION;

import java.util.Scanner;

public class recursionEight {
  public static int calcPower(int x, int n) {
    if (n == 0) {
      return 1;
    }
    if (x == 0) {
      return 0;
    }
    // if n is even
    if (n % 2 == 0) {
      return calcPower(x, n / 2) * calcPower(x, n / 2);
    } else { // if n is odd
      return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
    }
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the value of x:");
    int x = obj.nextInt();
    System.out.println("Enter the value of n:");
    int n = obj.nextInt();
    int ans = calcPower(x, n);
    System.out.println(ans);

  }
}
