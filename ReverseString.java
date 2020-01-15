
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter sentences what you want");
        String input = sc.nextLine();

        System.out.println("are your sentence is true ? " + getString(input));
    }

    static String getString(String sentence){
        String reverse = "";
        for (int i = sentence.length()-1; i >= 0; i --) {
            reverse += sentence.charAt(i);
        }
        return reverse;
    }
}
