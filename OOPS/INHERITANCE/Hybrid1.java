package OOPS.INHERITANCE;

class A {
  int rollno = 1;
}

class B extends A {
  String name = "Lucky Kumari";
}

interface C {
  String address = "Garhwa";
}

class D extends B implements C {
  int amount = 500;

  void disp() {
    System.out.println("Rollno is :" + rollno);
    System.out.println("Name is :" + name);
    System.out.println("Address is :" + address);
    System.out.println("Amount is :" + amount);
  }
}

public class Hybrid1 {
  public static void main(String[] args) {
    D obj = new D();
    obj.disp();
  }
}
