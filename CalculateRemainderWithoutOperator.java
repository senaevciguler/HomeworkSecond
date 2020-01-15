import java.util.Scanner;

public class CalculateRemainderWithoutOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("please enter one number");
        int number = sc.nextInt();
        System.out.println("please enter dividor number");
        int dividor = sc.nextInt();

        System.out.println("remainder of number is: " + division(number, dividor));
    }
    static int division (int number1, int number2) {
        int result =  number1 - ((number1 /number2) * number2);
        return result;
    }
}

