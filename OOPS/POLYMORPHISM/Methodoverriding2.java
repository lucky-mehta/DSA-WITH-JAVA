package OOPS.POLYMORPHISM;

import java.util.Scanner;

class test {
  int a, b;

  void getdata(int x, int y) {
    a = x;
    b = y;
  }

  void calc() {
    System.out.println("Sub is :" + (a - b));
  }
}

class test1 extends test {
  void calc() {
    System.out.println("Sum is:" + (a + b));
    System.out.println("Sub is :" + (a - b)); // YE LIKHNA COMPALSARY H KUIKI YE NAI LIKHENGE TO BS SUM WALA HI OUTPUT
                                              // ME MILEGA ...
  }
}

public class Methodoverriding2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the first number");
    int a = obj.nextInt();
    System.out.println("Enter the second value:");
    int b = obj.nextInt();
    test1 t = new test1();
    t.getdata(a, b);
    t.calc();
  }
}
