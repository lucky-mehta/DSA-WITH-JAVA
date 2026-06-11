//Q1. ENTER 3 NUMBER FROM THE USER & MAKE A FUNCTION TO PRINT THEIR AVERAGE.

import java.util.Scanner;

public class average {
  public static int calculateAverage(int a, int b, int c) {
    int sum = a + b + c;
    int avg = (sum) / 3;
    return avg;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the first number");
    int a = obj.nextInt();
    System.out.println("enter the second number");
    int b = obj.nextInt();
    System.out.println("enter the third number");
    int c = obj.nextInt();
    int avg = calculateAverage(a, b, c);
    System.out.println("Average number is:" + avg);
  }
}
