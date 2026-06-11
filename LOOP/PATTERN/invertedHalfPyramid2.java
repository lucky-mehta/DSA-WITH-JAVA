package LOOP.PATTERN;

public class invertedHalfPyramid2 {
  public static void main(String[] args) {
    int i, j, k;
    // outer loop
    for (i = 1; i <= 5; i++) {
      // inner loop -> space print
      for (j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
      }
      // inner loop -> star print
      for (k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
