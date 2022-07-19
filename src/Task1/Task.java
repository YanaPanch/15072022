package Task1;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int redCounter = 0;
        int greenCounter = 0;
        while (time > 0) {
            time -= 3;
            greenCounter++;
            if (time > 0) {
                time -= 2;
                redCounter++;
            }
        }
        System.out.println(greenCounter > redCounter ? "Green" : "Red");
    }
}
