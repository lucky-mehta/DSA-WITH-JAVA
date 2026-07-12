package OOPS.INHERITANCE;

import java.util.Scanner;

class first2 {
  int a, b;

  void getData(int x, int y) {
    a = x;
    b = y;
  }

  void print() {
    System.out.println("First no is:" + a);
  }
}

class second2 extends first2 {
  void sum() {
    System.out.println("Sum is:" + (a + b));
  }
}

class third2 extends first2 {
  void sub() {
    System.out.println("Sub is:" + (a - b));
  }
}

class Fourth extends first2 {
  void mul() {
    System.out.println("Mul is :" + (a * b));
  }
}

public class Hierarchicla2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the value of first number:");
    int a = obj.nextInt();
    System.out.println("Enter the value of second number:");
    int b = obj.nextInt();
    Fourth t1 = new Fourth();
    t1.getData(a, b);
    t1.print();
    t1.mul();
    third2 t2 = new third2();
    t2.getData(a, b);
    t2.sub();
    second2 t3 = new second2();
    t3.getData(a, b);
    t3.sum();
  }
}
