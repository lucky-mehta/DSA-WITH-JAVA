package IFELSE;

import java.util.Scanner;

public class ifStatement {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the age :");
    int age = obj.nextInt();
    if (age >= 18) {
      System.out.println("Adult");
    } else {
      System.out.println("Not Adult");
    }
  }
}
