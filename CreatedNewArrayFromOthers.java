
import java.util.Arrays;

public class CreatedNewArrayFromOthers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(addArray(arr, arr2)));
    }

    static int[] addArray(int[] arr1, int[] arr2) {
        int aLen = arr1.length;
        int bLen = arr2.length;
        int[] result = new int[aLen + bLen];

        int index= 0;
        for(int item: arr1) {
            result[index] = item;
            index++;
        }

        for( int item: arr2) {
            result[index] = item;
            index++;
        }

        return result;
    }
}


