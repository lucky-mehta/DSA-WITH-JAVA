//Print a string in reverse order using recursion.
package RECURSION;

import java.util.Scanner;

public class recursionNine {
  public static void printRev(String str, int idx) {
    if (idx == 0) {
      System.out.println(str.charAt(idx));
      return;
    }
    System.out.print(str.charAt(idx));
    printRev(str, idx - 1);
  }

  public static void main(String[] args) {
    String str = "";
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the any string:");
    str = obj.next();
    printRev(str, str.length() - 1);
  }
}
