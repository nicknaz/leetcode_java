package Easy.LongestCommonPrefix;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] strs = new String[]{"reflower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String result = strs[0];
        String compared = strs[strs.length-1];

        if (strs.length == 1) {
            return result;
        }

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != compared.charAt(i)) {
                return result.substring(0, i);
            }
        }

        return result;
    }

}
