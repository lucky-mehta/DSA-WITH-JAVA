//Q5. WRITE A FUNCTION THAT TAKES IN AGE AS INPUT AND RETURN IF THAT PERSON IS ELIGIBLE TO VOTE OR NOT.A PERSON OF AGE>18 IS ELIGIBLE FOR VOTE.

import java.util.Scanner;

public class eligibleForVote {
  public static void calculateElegibility(int n) {

    if (n <= 18) {
      System.out.println("Person is legible for vote");
    } else {
      System.out.println("Person is not eligible for vote");
    }
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the age of the person:");
    int n = obj.nextInt();
    calculateElegibility(n);
  }
}
