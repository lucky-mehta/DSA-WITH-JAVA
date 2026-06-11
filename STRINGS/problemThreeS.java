
//REVERSE STRING

package STRINGS;

import java.util.Scanner;

public class problemThreeS {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the any String:");
    String name = obj.next();
    String reverse = " ";
    for (int i = name.length() - 1; i >= 0; i--) {
      reverse = reverse + name.charAt(i);
    }
    System.out.println("Reverse of String is:" + reverse);
  }
}
