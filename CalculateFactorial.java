
import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter one number");
        int num = sc.nextInt();

        System.out.println("your number's factorial is: " + calculateFactorial(num));
    }

    static int calculateFactorial(int number){
        int result = 1;
        for(int i = 2; i <= number; i++)
            result *= i;
            return result;
    }
}
