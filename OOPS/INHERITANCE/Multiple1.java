package OOPS.INHERITANCE;

interface abc1 {
  int rollno = 01;

  void dispa();
}

interface abc2 {
  void dispb();
}

class abc3 implements abc1, abc2 {
  public void dispa() {
    System.out.println("Rollno is:" + rollno);
  }

  public void dispb() {
    System.out.println("Method of second interface");
  }
}

public class Multiple1 {
  public static void main(String[] args) {
    abc3 obj = new abc3();
    obj.dispa();
    ;
    obj.dispb();
  }
}
