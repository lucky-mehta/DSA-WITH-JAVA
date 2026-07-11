package OOPS.CLASSANDOBJECT;

import java.util.Scanner;

class Secondproblem {
  String name;
  String fatherName;
  String MotherName;
  String Collage;
  int Rollno;
  int age;

  public void printinfo() {
    System.out.println("THIS IS MY INFORMATION:");
    System.out.println("My name is :" + name);
    System.out.println("My father's name is :" + fatherName);
    System.out.println("My mother's name is :" + MotherName);
    System.out.println("My college name is:" + Collage);
    System.out.println("My rollno is :" + Rollno);
    System.out.println("My age is :" + age);
  }
}

public class Second {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the name:");
    String name = obj.nextLine();
    System.out.println("Enter the Father's name:");
    String father = obj.nextLine();
    System.out.println("Enter the Mother's name:");
    String mother = obj.nextLine();
    System.out.println("Enter the college name:");
    String college = obj.nextLine();
    System.out.println("Enter the Rollno:");
    int rollno = obj.nextInt();
    System.out.println("Enter the age:");
    int age = obj.nextInt();
    Secondproblem t = new Secondproblem();
    t.name = name;
    t.fatherName = father;
    t.MotherName = mother;
    t.Collage = college;
    t.Rollno = rollno;
    t.age = age;

    t.printinfo();

  }
}
