package LOOP.PATTERN;

public class polindroicPattern {
  public static void main(String[] args) {
    int i, j, n = 5;
    for (i = 1; i <= n; i++) {
      // spaces
      for (j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      // 1st half number
      for (j = i; j >= 1; j--) {
        System.out.print(j);
      }

      // 2nd half
      for (j = 2; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
