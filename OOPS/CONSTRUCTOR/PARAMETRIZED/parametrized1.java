package OOPS.CONSTRUCTOR.PARAMETRIZED;

import java.util.Scanner;

class para {
  int l, b;

  public para(int x, int y) {
    l = x;
    b = y;
  }

  void area() {
    int A = l * b;
    System.out.println("Area of rectangle is:" + A);
  }

  void perimeter() {
    int P = 2 * (l + b);
    System.out.println("Perimeter of rectangle is:" + P);
  }
}

public class parametrized1 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the length of rectangle:");
    int a = obj.nextInt();
    System.out.println("Enter the breath of rectangle:");
    int b = obj.nextInt();
    para t = new para(a, b);
    t.area();
    t.perimeter();
  }
}
