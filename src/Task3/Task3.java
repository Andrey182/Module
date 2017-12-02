package Task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomInt = (int) (Math.random() * 10);
            Integer randomInteger = new Integer(randomInt);
            randomNumber.add(randomInteger);
        }
        System.out.println(randomNumber);
        HashSet<Integer> differntNumber = new HashSet<>(randomNumber);
        System.out.println(differntNumber.size());
    }
}
