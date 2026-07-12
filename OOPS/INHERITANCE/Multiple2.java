package OOPS.INHERITANCE;

import java.util.Scanner;

class first4 {
  int a, b;

  void getmarks(int x, int y) {
    a = x;
    b = y;

  }

  void dispmarks() {
    System.out.println("First marks is:" + a);
    System.out.println("Second marks is:" + b);
  }
}

interface second4 {
  int sp = 10;

  void sportmark();
}

class third4 extends first4 implements second4 {
  public void sportmark() {
    System.out.println("Sports marks is :" + sp);
  }

  void totalmarks() {
    int total;
    total = a + b + sp;
    System.out.println("Total marks is :" + total);
  }
}

public class Multiple2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the first marks:");
    int a = obj.nextInt();
    System.out.println("Enter the second marks:");
    int b = obj.nextInt();
    third4 t1 = new third4();
    t1.getmarks(a, b);
    t1.dispmarks();
    t1.sportmark();
    t1.totalmarks();
  }
}
