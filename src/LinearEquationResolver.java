import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        float a,x,b;
        Scanner sc = new Scanner(System.in);
        //*******************
        //*    ax + b = 0   *
        //*******************

        System.out.print("Enter num a: ");
        a = sc.nextFloat();
        System.out.print("Enter num b: ");
        b = sc.nextFloat();
        if ( a == 0 ){
            if ( b == 0 ){
                System.out.println("Equation The equation has infinitely many solutions");
            }else{
                System.out.println("Equatione No Solutione ");
            }
        }else if ( b != 0 ){
            x = - b/a;
            System.out.println("Equatione have Solution: " + x );
        }
    }
}
