package Task5;

import java.util.Scanner;

public class Horse {
    private String writeX;
    private String writeX1;
    private char x;
    private int y;
    private char x1;
    private int y1;
    Scanner scanner = new Scanner(System.in);

    public boolean checkMove() {
        System.out.println("Ведите х");
        writeX = scanner.nextLine();
        x = writeX.charAt(0);
        System.out.println("Введите у");
        y = Integer.parseInt(scanner.nextLine());
        if (x < 'a' || y <= 0 || x > 'h' || y > 8) {
            System.out.println("Неверно ввели даные");
            return false;
        }
        System.out.println("Ведите х1");
        writeX1 =  scanner.nextLine();
        x1 = writeX1.charAt(0);
        System.out.println("Введите у1");
        y1 = Integer.parseInt(scanner.nextLine());

        if (((x1 == x + 1 & y1 == y + 2) || (x1 == x + 2 & y1 == y + 1)) & (x1 > 'a' || x1 < 'h' )  & (y1 > 0 & y1<9))
            return true;
        else if (((x1 == x - 1 & y1 == y + 2) || (x1 == x - 2 & y1 == y + 1))  & (x1 > 'a' || x1 < 'h' )  & (y1 > 0 & y1<9))
            return true;
        else if (((x1 == x + 1 & y1 == y - 2) || (x1 == x + 2 & y1 == y - 1))  & (x1 > 'a' || x1 < 'h' )  & (y1 > 0 & y1<9))
            return true;
        else if (((x1 == x - 1 & y1 == y - 2) || (x1 == x - 2 & y1 == y - 1))  & (x1 > 'a' || x1 < 'h' )  & (y1 > 0 & y1<9))
            return true;
        else return false;
    }
}

