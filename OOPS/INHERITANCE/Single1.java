package OOPS.INHERITANCE;

import java.util.Scanner;

class first {
  int a, b;

  void printarith(int p, int q) {
    a = p;
    b = q;
  }

  void sum() {
    System.out.println("Sum is:" + (a + b));
  }
}

class second extends first {
  void mul() {
    System.out.println("Multiplication is:" + (a * b));
  }
}

public class Single1 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the first value:");
    int a = obj.nextInt();
    System.out.println("Enter the second value:");
    int b = obj.nextInt();
    second t = new second();
    t.printarith(a, b);
    t.sum();
    t.mul();

  }

}
