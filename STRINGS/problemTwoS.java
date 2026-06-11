//FIND THE USERNAME IN THE EMAILID
package STRINGS;

import java.util.Scanner;

public class problemTwoS {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the Email:");
    String email = obj.next();
    String userName = " ";
    for (int i = 0; i < email.length(); i++) {
      char ch = email.charAt(i);
      if (ch == '@') {
        break;
      }
      userName = userName + ch;
    }
    System.out.println("User name is:" + userName);
  }
}
