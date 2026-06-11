package LOOP.PATTERN;

public class butterfly {
  public static void main(String[] args) {
    int i, j;
    // uper half
    for (i = 1; i <= 5; i++) {
      // first part
      for (j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // spaces
      int spaces = 2 * (5 - i);
      for (j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      // 2nd part
      for (j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // lower half
    for (i = 5; i >= 1; i--) {
      // first part
      for (j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // spaces
      int spaces = 2 * (5 - i);
      for (j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      // 2nd part
      for (j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
