package STRINGS;

public class fiveS {
  public static void main(String[] args) {
    // compare
    String firstName = "Lucky";
    String lastName = "Lucky";

    // 1 s1>s2 : +ve value
    // 2 s1==s2 : 0
    // 3 s1<s2 : -ve value

    // System.out.println(firstName.compareTo(lastName));

    if (firstName.compareTo(lastName) == 0) {
      System.out.println("Strings arae equal");
    } else {
      System.out.println("Strings are not equal");
    }

  }
}
