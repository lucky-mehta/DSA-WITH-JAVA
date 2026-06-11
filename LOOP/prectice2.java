package LOOP;
//Print the table of a number input by the user.

import java.util.Scanner;

public class prectice2 {
  public static void main(String[] args) {
    int i, n;
    Scanner obj = new Scanner(System.in);
    System.out.println("Table of a number input by the user:");
    n = obj.nextInt();
    for (i = 1; i <= 10; i++) {
      System.out.println("" + (n * i));
    }
  }
}
