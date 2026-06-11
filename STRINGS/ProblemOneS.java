//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

package STRINGS;

import java.util.Scanner;

public class ProblemOneS {
  public static void main(String[] args) {
    int n;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number of String:");
    n = obj.nextInt();
    String[] arr = new String[n];

    System.out.println("Enter the Strings:");
    for (int i = 0; i < n; i++) {
      arr[i] = obj.next();
    }
    System.out.println("Strings are:");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i] + " ");
    }

    int totalLength = 0;
    for (int i = 0; i < n; i++) {
      totalLength = totalLength + arr[i].length();
    }
    System.out.println("Cumulative length=" + totalLength);
  }

}
