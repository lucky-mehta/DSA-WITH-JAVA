package OOPS.INHERITANCE;

class Animal {
  void eat() {
    System.out.println("Eating.....");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("Barkiing....");
  }
}

class BabyDog extends Dog {
  void weep() {
    System.out.println("Weeping.....");
  }
}

public class Multilevel1 {
  public static void main(String[] args) {
    BabyDog obj = new BabyDog();
    obj.bark();
    obj.eat();
    obj.weep();
  }
}
