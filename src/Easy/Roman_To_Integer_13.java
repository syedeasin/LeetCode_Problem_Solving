package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Roman_To_Integer_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int total = 0;

        Map<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I',1);
        romanToInteger.put('V',5);
        romanToInteger.put('X',10);
        romanToInteger.put('L',50);
        romanToInteger.put('C',100);
        romanToInteger.put('D',500);
        romanToInteger.put('M',1000);

        for(int i = 0; i<s.length();i++) {
            System.out.println(romanToInteger);
        }
    }
}
