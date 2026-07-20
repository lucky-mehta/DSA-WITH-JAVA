package OOPS.DATAABSTRACTION;

abstract class Animal {
  abstract void sound(); // abstract method

  void sleep() {
    System.out.println("Animal is sleeping");
  }
}

class Dog extends Animal {
  void sound() {
    System.out.println("Dog is barks");
  }
}

public class abstraction1 {
  public static void main(String[] args) {
    Dog obj = new Dog();
    obj.sound();
    obj.sleep();
  }
}
