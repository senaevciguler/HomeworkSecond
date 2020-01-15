

import java.util.Scanner;

public class IntgereToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter one integer number");
        String str ="";
        int number = sc.nextInt();
        while(number > 0)
        {
            //formule
            int y = number % 2;
            str = y + str;
            number = number / 2;
        }
        System.out.println("The binary conversion is : " + str);

    }

    }

    /* can use to toBinaryString
    int i = 10;
    System.out.println(Integer.toBinaryString(i);
     */

