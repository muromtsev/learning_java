package kata;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class kata_5_2_14 {

    public static Map<String, Long> getSalesMap(Reader reader) {
        HashMap<String, Long> map = new HashMap<>();
        Scanner scan = new Scanner(reader);

        while (scan.hasNext()) {
            String key = scan.next();
            long value = scan.nextLong();
            if (!(map.containsKey(key))) {
                map.put(key, value);
            } else {
                map.put(key, map.get(key) + value);
            }
        }
        return map;
    }

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000".getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(bais));
        System.out.println(getSalesMap(buffReader));
    }

}
