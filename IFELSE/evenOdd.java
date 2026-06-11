package IFELSE;

import java.util.*;

public class evenOdd {
  public static void main(String[] args) {
    int x;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the any number:");
    x = obj.nextInt();
    if (x % 2 == 0) {
      System.out.println("number is even");
    } else {
      System.out.println("number is odd");
    }
  }
}
