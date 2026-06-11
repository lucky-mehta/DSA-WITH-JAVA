package STRINGS;

import java.util.Scanner;

public class problemSixS {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the any string:");
    String str = obj.next();
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
          ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        count = count + 1;
      }
    }
    System.out.println("Total vowel in this string is:" + count);
  }
}
