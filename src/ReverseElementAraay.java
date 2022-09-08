import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseElementAraay {
    public static void main(String[] args) {
        int[] array = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        reverseElement(array);
        printArray(array);

    }
    public static void printArray(int[] array){
        for ( int i : array){
            System.out.print(i + " ");
        }
    }
    public static void reverseElement(int[] array){
        int first = 0;
        int numLength = array.length;
        int last = numLength - 1;
        int temp;
        for ( int i = 0 ; i < numLength ; i++){
            if(first < last) {
                temp = array[first];
                array[first] = array[last];
                array[last ] = temp;
            }
            first++;
            last--;
        }
        return ;
    }
}
