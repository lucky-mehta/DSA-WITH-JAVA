// Q3. WRITE A FUNCTION WHICH TAKES IN 2 NUMBERS AND RETURNA THE GREATER OF THOSE TWO.

import java.util.Scanner;

public class greaterNo {
  public static int calculateGreaterNo(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the value of a:");
    int a = obj.nextInt();
    System.out.println("enter the value of b:");
    int b = obj.nextInt();
    System.out.println("Greater no is:" + calculateGreaterNo(a, b));
  }
}
