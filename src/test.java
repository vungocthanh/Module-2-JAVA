import java.util.Arrays;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int array[] = new int[10];
        creatArray(array);
        printArray(array);
    }
    public static void printArray(int[] array){
        for ( int i : array){
            System.out.print(i + " ");
        }
    }
    public static void creatArray(int[] array){

        Scanner sc = new Scanner(System.in);
        int num;
        for ( int i = 0 ; i < array.length ; i++){
            System.out.print("Enter Element: ");
            array[i] = sc.nextInt();
        }
        return;
    }
}