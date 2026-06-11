package STRINGS;

public class fourS {
  public static void main(String[] args) {
    String firstName = "Lucky";
    String lastName = "Kumari";
    String fullName = firstName + " " + lastName;
    System.out.println("FullName is:" + fullName);
    System.out.println(fullName.length());
    // System.out.println(fullName.toUpperCase());
    // System.out.println(fullName.toLowerCase());

    // charAt

    // WITHOUT LOOP
    // System.out.println(fullName.charAt(3));

    // WITH LOOP
    for (int i = 0; i < fullName.length(); i++) {
      System.out.println(fullName.charAt(i));
    }

  }
}
