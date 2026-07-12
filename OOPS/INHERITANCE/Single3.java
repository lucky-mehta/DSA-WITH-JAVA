package OOPS.INHERITANCE;

class abc {
  int a, b;

  void getData(int x, int y) {
    a = x;
    b = y;
  }

  void sum() {
    int c = a + b;
    System.out.println("Sum is:" + c);
  }
}

class cde extends abc {
  void sub() {
    int d = a - b;
    System.out.println("Subtraction is:" + d);
  }
}

public class Single3 {
  public static void main(String[] args) {
    cde obj = new cde();
    obj.getData(20, 10);
    obj.sum();
    obj.sub();
  }
}
