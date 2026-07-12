package OOPS.POLYMORPHISM;

import java.util.Scanner;

class overloading2 {
  void printsum(int a, int b, int c) {
    System.out.println("First sum is:" + (a + b + c));
  }

  void printsum(int a, int b) {
    System.out.println("Multiplication is:" + (a * b));
  }
}

public class Methodoverloading2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a = obj.nextInt();
    System.out.println("Enter the value of b:");
    int b = obj.nextInt();
    System.out.println("Enter the value of c:");
    int c = obj.nextInt();

    overloading2 t = new overloading2();
    t.printsum(a, b, c);
    t.printsum(a, b);
  }
}
