package LOOP;

//print the sum of first n natural number.
import java.util.*;

public class prectice1 {
  public static void main(String[] args) {
    int i = 1, n, s = 0;
    Scanner obj = new Scanner(System.in);
    System.out.println("ENTER THE LIMIT OF SERIES:");
    n = obj.nextInt();
    while (i <= n) {
      s = s + i;
      i = i + 1;
    }
    System.out.println("SUM OF SERIES IS:" + s);
  }
}
