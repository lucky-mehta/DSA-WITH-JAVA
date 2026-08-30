package STACK;

import java.util.Scanner;
import java.util.Stack;

public class secondStack {
  public static void main(String[] args) {
    int n;
    Scanner obj = new Scanner(System.in);
    Stack<Integer> st = new Stack<>();
    System.out.println("Enter the number of element you want to insert:");
    n = obj.nextInt();
    System.out.println("Enter the element:");
    for (int i = 1; i <= n; i++) {
      int x = obj.nextInt();
      st.push(x);
    }
    System.out.println(st);
  }
}
