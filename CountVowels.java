
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter one sentences what you want");
        String input = sc.nextLine();

        System.out.println("there have " + countVowels(input) + " vowels in your sentence");
        //System.out.println("your sentence has a: " + printVowels(input));

    }

    static int countVowels(String str) {
        str = str.toLowerCase();
        char vowels1 = 'a';
        char vowels2 = 'e';
        char vowels3 = 'i';
        char vowels4 = 'o';
        char vowels5 = 'u';
        int count = 0;

       for(int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == vowels1 || str.charAt(i) == vowels2
                   || str.charAt(i) == vowels3 || str.charAt(i) == vowels4 || str.charAt(i) == vowels5)
               count++;
       }
       return count;

       }

    }

    

