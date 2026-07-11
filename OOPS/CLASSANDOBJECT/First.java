package OOPS.CLASSANDOBJECT;

class Firstproblem {
  String color;
  String type;

  public void write() {
    System.out.println("Writting something");
  }

  public void printcolor() {
    System.out.println(this.color);
  }

  public void printtype() {
    System.out.println(this.type);
  }
}

public class First {
  public static void main(String[] args) {
    Firstproblem t1 = new Firstproblem();
    t1.color = "blue";
    t1.type = "gel";
    t1.printcolor();
    t1.printtype();
    t1.write(); // write method ka object dono me bn skta h

    Firstproblem t2 = new Firstproblem();
    t2.color = "red";
    t2.type = "ballpoint";
    t2.printtype();
    t2.printcolor();
    // t2.write();

  }

}
