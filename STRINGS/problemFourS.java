package STRINGS;

import java.util.Scanner;

public class problemFourS {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the any String:");
    String name = obj.next();
    String reverse = "";
    for (int i = name.length() - 1; i >= 0; i--) {
      reverse = reverse + name.charAt(i);
    }
    if (name.equals(reverse)) {
      System.out.println("Givem string is polindrom");
    } else {
      System.out.println("Given string is not polindrom");
    }

  }
}
