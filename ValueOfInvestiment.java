
import java.util.Scanner;

public class ValueOfInvestiment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter your current total money");
        double money = sc.nextDouble();

        System.out.println("please enter interest rate in your country");
        double interestRate = sc.nextDouble();

        System.out.println(" please enter how many years of investment you intend");
        double year = sc.nextDouble();

        System.out.println(" 1 year later your total money will be " + calculateInvestmentValue(money,interestRate,year));
    }
    static double calculateInvestmentValue(double price, double rate, double year) {
        double calculate = (price / 100) * (rate) * year;
        return calculate;
    }
}
