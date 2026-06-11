
// Q10. WAP TO PRINT FIBONACCI SERIES OF N TERMS WHERE N IS INPUT BY USER.
import java.util.Scanner;

public class fibonacciSeries {
  public static void calculatFaibonacci(int n) {
    int a = 0, b = 1, c, i;
    for (i = 1; i <= n; i++) {
      System.out.println(" " + a);
      c = a + b;
      a = b;
      b = c;
    }
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the limit of series:");
    int n = obj.nextInt();
    calculatFaibonacci(n);
  }
}
