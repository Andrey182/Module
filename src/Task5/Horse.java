package Task5;

import java.util.Scanner;

public class Horse {
    private char x;
    private int y;
    private char x1;
    private int y1;
    Scanner scanner = new Scanner(System.in);

    public boolean checkMove() {
        System.out.println("Ведите х");
        x = (char) scanner.nextInt();
        System.out.println("Введите у");
        y = scanner.nextInt();
        if ((x <= 0 & y <= 0) || (x > 8 & y > 8)) {
            System.out.println("Неверно ввели даные");
        return false;}
            System.out.println("Ведите х1");
            x1 = (char) scanner.nextInt();
            System.out.println("Введите у1");
            y1 = scanner.nextInt();

            if (((x1 == x + 1 & y1 == y + 2) || (x1 == x + 2 & y1 == y + 1)) & x1 > 0 & y1 > 0 & x > 0 & y > 0)
                return true;
            else if (((x1 == x - 1 & y1 == y + 2) || (x1 == x - 2 & y1 == y + 1)) & x1 > 0 & y1 > 0)
                return true;
            else if (((x1 == x + 1 & y1 == y - 2) || (x1 == x + 2 & y1 == y - 1)) & x1 > 0 & y1 > 0)
                return true;
            else if (((x1 == x - 1 & y1 == y - 2) || (x1 == x - 2 & y1 == y - 1)) & x1 > 0 & y1 > 0)
                return true;
            else return false;
        }
    }

