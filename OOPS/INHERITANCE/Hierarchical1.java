package OOPS.INHERITANCE;

class Animal {
  void eat() {
    System.out.println("Eating....");
  }
}

class Dog1 extends Animal {
  void bark() {
    System.out.println("Barking......");
  }
}

class Cat extends Animal {
  void meow() {
    System.out.println("Meowing......");
  }
}

public class Hierarchical1 {
  public static void main(String[] args) {
    Cat obj = new Cat();
    obj.eat();
    Dog1 obj1 = new Dog1();
    obj1.bark();
    obj.eat();

  }
}
