package Task3;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        int counter1 = 0, counter2 = 0, counter3 = 0;

        int randomNumber = (int) (Math.random() * 10);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNumber;
            randomNumber = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < (arr.length); i++) {
            for (int j = 0; j < (arr.length); j++) {
                if (arr[i] == arr[j]) {
                    counter1++;
                }
            }

            if (counter1 == 1) {
                counter2++;
            }
            if (counter1 > 1)
                counter3++;
            counter1 = 0;
        }
            System.out.println(counter2+counter3);
    }
}
