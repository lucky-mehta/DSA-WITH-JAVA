package SWITCH;

import java.util.Scanner;

public class arithmatic {
  public static void main(String[] args) {
    int a, b, choice;
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the value of a:");
    a = obj.nextInt();
    System.out.println("enter the value of b:");
    b = obj.nextInt();
    System.out.println("enter the choice:");
    choice = obj.nextInt();
    switch (choice) {
      case 1:
        System.out.println("Addition is:" + (a + b));
        break;
      case 2:
        System.out.println("Subtraction is:" + (a - b));
        break;
      case 3:
        System.out.println("Multiplication is:" + (a * b));
        break;
      case 4:
        System.out.println("Division is:" + (a / b));
        break;
      case 5:
        System.out.println("Modulus is :" + (a % b));
        break;
      default:
        System.out.println("Not a choice");
        break;
    }

  }
}
