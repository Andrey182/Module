package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nonNumber = (int) (Math.random() * 40);
        int numberAttemt = 16;
        for (int i = 0; i < numberAttemt; i++) {
            System.out.println("Введите число");
            int myNumber = scanner.nextInt();
            if (myNumber != nonNumber) {
                if (myNumber < nonNumber) {
                    System.out.println("Загадонное число больше");
                } else {
                    System.out.println("Загаданное число меньше");
                }
            } else {
                System.out.println("вы угадали");
                break;
            }
        }
    }

}
