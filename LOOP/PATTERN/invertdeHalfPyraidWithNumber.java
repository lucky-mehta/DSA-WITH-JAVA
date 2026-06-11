package LOOP.PATTERN;

public class invertdeHalfPyraidWithNumber {
  public static void main(String[] args) {
    int i, j;
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= 5 - i + 1; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
