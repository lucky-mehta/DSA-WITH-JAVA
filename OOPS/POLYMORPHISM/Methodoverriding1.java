package OOPS.POLYMORPHISM;

class parents {
  int x = 10;

  void disp() {
    System.out.println("Super:" + x);
  }
}

class sub extends parents {
  int y = 20;

  void disp() {
    System.out.println("Super:" + x);
    System.out.println("Sub:" + y);
  }
}

public class Methodoverriding1 {
  public static void main(String[] args) {
    sub obj = new sub();
    obj.disp();
  }
}
