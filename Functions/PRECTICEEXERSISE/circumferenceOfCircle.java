
//Q4. WRITE A FUNCTION THAT TAKES IN THE RADIUS AS INPUT AND RETURNS THE CIRCUMFERENCE OF A CIRCLE.
import java.util.Scanner;

public class circumferenceOfCircle {
  public static Float calculateCircumference(float r) {
    float pi = 3.14f;
    float circumference = 2 * pi * r;
    return circumference;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the radius of circumference:");
    float r = obj.nextFloat();
    System.out.println("Circumference of circle is:" + calculateCircumference(r));
  }
}
