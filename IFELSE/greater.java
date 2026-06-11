package IFELSE;

import java.util.*;

public class greater {
  public static void main(String[] args) {
    int a, b, c;
    char greatest;
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the first number");
    a = obj.nextInt();
    System.out.println("enter the second number:");
    b = obj.nextInt();
    System.out.println("enter the third number");
    c = obj.nextInt();
    if ((a > b) && (a > c)) {
      greatest = 'a';
    } else if ((b > c) && (b > a)) {
      greatest = 'b';
    } else {
      greatest = 'c';
    }
    System.out.println("Greater number is:" + greatest);
  }
}
