package Task2;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("Number " + number + " has " + howManyDigits(number) + " digits");
        System.out.println("Enter digit You are looking for: ");
        int digit = scanner.nextInt();
        printNumbers(digit);
        reverse(number);

    }

    public static int howManyDigits(int number){
        int positiveNumber = Math.abs(number);
        int length = String.valueOf(positiveNumber).length();
        return length;
    }

    public static boolean isDigitPresent( int number, int digit){
        while (number > 0){
            if (number % 10 == digit)
                break;
            number /= 10;
        }
        return (number > 0);
    }

     public static void printNumbers(int digit){
        for (int i = 0; i <= 10; i++)
            if (i == digit && isDigitPresent(i, digit))
                System.out.println("Number consist this digit");
    }

    public static void reverse(int number){
        if (number < 10){
            System.out.println(number);
            return;
        } else{
            System.out.print(number % 10);
            reverse(number/10);
        }
    }
}
