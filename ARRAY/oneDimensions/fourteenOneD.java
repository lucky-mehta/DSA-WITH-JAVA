package ARRAY.oneDimensions;

import java.util.Scanner;

public class fourteenOneD {
  public static void main(String[] args) {

    int size;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the size of the String Array:");
    size = obj.nextInt();
    String[] names = new String[size];

    System.out.println("Enter the element of the String Array:");
    for (int i = 0; i < names.length; i++) {
      names[i] = obj.next();
    }

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

  }
}
