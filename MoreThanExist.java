
public class MoreThanExist {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 5, 6, 2};
        System.out.println("have my array exists more than once in an array?");
        boolean isMirror = false;


        for (int i = 0; i < arr.length - 1; i++) {
            int check = arr[i];

            for (int count = 1; count < arr.length; count++) {
                if (check == arr[count]) {

                    isMirror = true;
                }
            }

        }
        System.out.println(isMirror);
    }
}
