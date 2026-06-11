package Functions;

import java.util.Scanner;

public class thirdFunctin {
  public static int calculateProduct(int a, int b) {
    return a * b;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    int b = obj.nextInt();

    System.out.println("product of two number is :" + calculateProduct(a, b));
  }
}
