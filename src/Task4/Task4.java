package Task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        HashMap<String, Integer> passwords = new HashMap<>();
        LinkedHashMap<String,Integer> passwordsMax = new LinkedHashMap<>();
        Path path = Paths.get("src/Task4/login&password.txt");
        try {
            List<String> lines = Files.lines(path).collect(Collectors.toList());
            System.out.println(lines);
            for (String line : lines) {
                String[] arr = line.split(" ");
                if (!passwords.containsKey(arr[1])) {
                    passwords.put(arr[1], 1);
                } else {
                    passwords.put(arr[1], passwords.get(arr[1]) + 1);
                }
            }
            System.out.println(passwords);
            while (!passwords.isEmpty() && passwordsMax.size()<2) {
                String maxKey = null;
                int maxValue = 0;
                for (Map.Entry<String, Integer> entry : passwords.entrySet()) {
                    if (entry.getValue() > maxValue) {
                        maxValue = entry.getValue();
                        maxKey = entry.getKey();
                    }
                }
                passwordsMax.put(maxKey,maxValue);
                passwords.remove(maxKey);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(passwordsMax);

    }
}
