package Easy.RomanToInt;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        chars.put('I', 1);
        chars.put('V', 5);
        chars.put('X', 10);
        chars.put('L', 50);
        chars.put('C', 100);
        chars.put('D', 500);
        chars.put('M', 1000);
        int n = s.length();
        int result = 0;
        for (int i = n-1; i >= 0; --i) {
            if (chars.get(s.charAt(i)) > 1 && chars.get('I') == 1) {
                chars.put('I', -1);
            }
            if (chars.get(s.charAt(i)) > 10 && chars.get('X') == 10) {
                chars.put('X', -10);
            }
            if (chars.get(s.charAt(i)) > 100 && chars.get('C') == 100) {
                chars.put('C', -100);
            }
            result += chars.get(s.charAt(i));
        }
        return result;
    }
}
