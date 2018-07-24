import java.util.ArrayList;
import java.util.Arrays;

public class EX27 {
    public static void main(String[] args) {
        ArrayList<Integer> numberArray = new ArrayList<Integer>();
        numberArray.addAll(Arrays.asList(5, 10, 2, 8, 7));
        printIntArray(numberArray);
    }

    public static void printIntArray(ArrayList<Integer> numberArray) {
        System.out.println(numberArray);

    }
}