//Print x'n (Stack height n)
package RECURSION;

import java.util.Scanner;

public class recursionSeven {
  public static int calcPower(int x, int n) {
    if (n == 0) {  //base case 1
      return 1;
    }
    if (x == 0) {  //base case 2
      return 0;
    }
    int xPownm1 = calcPower(x, n - 1);  //kaam
    int xpower = x * xPownm1;
    return xpower;
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
