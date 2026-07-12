package OOPS.INHERITANCE;

import java.util.Scanner;

class first1 {
  int a, b, c;

  void getData(int x, int y, int z) {
    a = x;
    b = y;
    c = z;
  }

  void sum() {
    System.out.println("Sum is:" + (a + b + c));
  }
}

class second1 extends first1 {
  void sub() {
    System.out.println("Subtraction is:" + (a - b - c));
  }
}

class third1 extends second1 {
  void mul() {
    System.out.println("Multiplication is:" + (a * b * c));
  }
}

public class Multilevel2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int a = obj.nextInt();
    System.out.println("Enter the second number:");
    int b = obj.nextInt();
    System.out.println("Enter the third number");
    int c = obj.nextInt();
    third1 t = new third1();
    t.getData(a, b, c);
    t.sum();
    t.sub();
    t.mul();
    obj.close();
  }
}