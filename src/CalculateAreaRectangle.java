import java.util.Scanner;

public class CalculateAreaRectangle {
    public static void main(String[] args) {
        float width;
        float height;
        float areaRectangle;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Width Rectangle: ");
        width = scanner.nextFloat();
        System.out.print("Enter Height Rectangle: ");
        height = scanner.nextFloat();
        areaRectangle = width * height;

        System.out.println("Area Rectangle : " + areaRectangle);
    }
}
