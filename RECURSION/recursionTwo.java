//Print number from 1 to 10
package RECURSION;

public class recursionTwo {

  public static void printNum(int n) {
    if (n == 10) {
      return;
    }
    System.out.println(n);
    printNum(n + 1);
  }

  public static void main(String[] args) {
    int n = 1;
    printNum(n);
  }

}
