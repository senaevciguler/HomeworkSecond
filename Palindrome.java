import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter one word");
        String input = sc.nextLine();
        if(palindrome(input)) {
            System.out.println("word which you enter is palindrome ");

        }else {
            System.out.println("the word is not palindrome");
        }
    }

    static boolean palindrome (String word) {
        int i = 0;
        int j = word.length()-1;
        for(i = 0 , j = word.length() -1; i < j;  i++ , j--) {
            if (word.charAt(i) != word.charAt(j))
                return false;
        }
        return true;
    }
}
