package STRINGBUILDER;

import java.util.Scanner;

public class builderSecond {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the any String:");
    String ab = obj.next();
    StringBuilder word = new StringBuilder(ab);
    word.reverse();
    System.out.println(word);
  }
}
