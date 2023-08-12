package Easy.FindTheIndexOfTheFirstOccurrenceInAString;

public class Main {

    public static void main(String[] args) {
        String haystack = "mississippi", needle = "ap";
        System.out.println(strStr(haystack, needle));
    }

    //0ms
    public static int strStr(String haystack, String needle) {
        int haystackLenght = haystack.length();
        int needleLength = needle.length();

        int result = 0;

        for (int i = 0; i < haystackLenght; i++) {

            if (haystack.charAt(i) == needle.charAt(result)){
                result++;
            } else {
                i = i - result;
                result = 0;
            }

            if (result == needleLength) {
                return i - result + 1;
            }

        }

        return -1;
    }

    //1ms
    public static int strStr2(String haystack, String needle) {
        int result = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (result == -1 && haystack.charAt(i) == needle.charAt(0)) {
                result = i;
            } else if (result != -1) {
                if (i - result == needle.length()) {
                    return result;
                } else if (haystack.charAt(i) != needle.charAt(i - result)) {
                    i = result;
                    result = -1;
                }
            }
        }
        if (result + needle.length() > haystack.length())
            return -1;
        return result;
    }

    // :)
    public static int strStr3(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}
