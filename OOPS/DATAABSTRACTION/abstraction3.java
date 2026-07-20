package OOPS.DATAABSTRACTION;

abstract class Shape {

  int length = 10;
  int width = 5;

  abstract void area();

  void perimeter() {
    System.out.println("Perimeter = " + (2 * (length + width)));
  }
}

class Rectangle extends Shape {

  @Override // ye likh bhi skte h or nahi bhi lkh skte
  void area() {
    System.out.println("Area = " + (length * width));
  }
}

public class abstraction3 {

  public static void main(String[] args) {

    Rectangle obj = new Rectangle();

    obj.area();
    obj.perimeter();
  }
}
