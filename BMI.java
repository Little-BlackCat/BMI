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

    System.out.println("Weight = " + weight + " kg");
    System.out.println("Height = " + height + " m");
    System.out.println("Your BMI is " + BMI);

    String predict = "";

    if(BMI < 18.5) {
      predict = "Underweight";
    } else if (BMI >= 18.5 && BMI < 25) {
      predict = "Normal weight";
    } else if (BMI >= 25 && BMI < 30) {
      predict = "Overweight";
    } else {
      predict = "Obesity";
    }
    System.out.println("BMI Categories : " + predict);
  }
}
