import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        double weight,height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a weight: ");
        weight = sc.nextDouble();
        System.out.print("Enter a height: ");
        height = sc.nextDouble();

        double BMI = weight / Math.pow(height,2);

        if (BMI >= 30) {
            System.out.println("Obese");
        } else if (BMI >= 25) {
            System.out.println("OverWeight");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Normal");
        } else{
            System.out.println("UnderWeight");
        }
    }
}
