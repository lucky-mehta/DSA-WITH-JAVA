package STRINGBUILDER;

public class builderFirst {
  public static void main(String[] args) {
    StringBuilder apple = new StringBuilder("LUCKY");
    System.out.println(apple);

    // char at index
    // System.out.println(apple.charAt(3));

    // set char ar index 0
    // apple.setCharAt(0, 'D');
    // System.out.println(apple);

    // insert
    // apple.insert(5, 'A');
    // System.out.println(apple);

    // delete
    // apple.delete(5, 6);
    // System.out.println(apple);

    // append
    // apple.append(" MEHTA");
    // System.out.println(apple.length());

    // reverse
    apple.reverse();
    System.out.println(apple);
  }
}
