package OOPS.DATAABSTRACTION;

abstract class abc {
  int a = 10;
  int b = 20;

  abstract void sum();

  void mul() {
    System.out.println("Multiplication is:" + (a * b));
  }
}

class fgh extends abc {
  void sum() {
    System.out.println("Addition is:" + (a + b));
  }
}

public class abstraction2 {
  public static void main(String[] args) {
    fgh obj = new fgh();
    obj.mul();
    obj.sum();
  }
}
