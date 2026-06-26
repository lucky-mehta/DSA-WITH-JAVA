//Find the first and last occurrence of an element in string using recursion.
package RECURSION;

import java.util.Scanner;

public class recursionTen {
  public static int first = -1;
  public static int last = -1;

  public static void findOccurance(String str, int idx, char element) {
    if (idx == str.length()) {
      System.out.println(first);
      System.out.println(last);
      return;
    }
    char currChar = str.charAt(idx);
    if (currChar == element) {
      if (first == -1) {
        first = idx;
      }
      last = idx;
    }

    findOccurance(str, idx + 1, element);

  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the any string:");
    String str = obj.next();
    System.out.println("Select the charecter of the given string:");
    char element = obj.next().charAt(0);
    findOccurance(str, 0, element);
  }
}
