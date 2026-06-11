package LOOP.PATTERN;

public class numberPyramid {
  public static void main(String[] args) {
    int i, j, n = 5;
    for (i = 1; i <= n; i++) {
      // space
      for (j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // number-> print row no,row no times
      for (j = 1; j <= i; j++) {
        System.out.print(" " + i);
      }
      System.out.println();
    }
  }
}
