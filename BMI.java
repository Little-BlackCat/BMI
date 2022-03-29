import java.util.Scanner;
public class BMI {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input your weight(kg) : ");
    float weight = sc.nextFloat();

    System.out.print("Input your height(cm) : ");
    float height = sc.nextFloat();
    height /= 100;

    final float BMI = weight/(height*height);

    System.out.println("Your BMI is " + BMI + ".");

  }
}
