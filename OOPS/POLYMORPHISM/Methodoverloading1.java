package OOPS.POLYMORPHISM;

class overloading1 {
  void add(int a, int b) {
    int c = a + b;
    System.out.println("First sum is:" + c);
  }

  void add(int j, int k, int l) {
    int d = j + k + l;
    System.out.println("Second sum is:" + d);
  }
}

public class Methodoverloading1 {
  public static void main(String[] args) {
    overloading1 obj = new overloading1();
    obj.add(10, 20);
    obj.add(15, 20, 10);

  }
}
