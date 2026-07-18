package OOPS.CONSTRUCTOR.DEFAULT;

class defal {
  int a, b;

  public defal() {
    a = 5;
    b = 10;
  }

  void display() {
    System.out.println("value of a is:" + a);
    System.out.println("value of b is:" + b);
  }
}

public class default1 {

  public static void main(String[] args) {
    defal obj = new defal();
    obj.display();
  }
}
