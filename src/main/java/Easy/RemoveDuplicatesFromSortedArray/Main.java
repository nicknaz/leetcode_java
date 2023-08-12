package Easy.RemoveDuplicatesFromSortedArray;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{-3,-1,0,0,0,3,3};
        System.out.println("Answer: " + removeDuplicates(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    //1ms
    public static int removeDuplicates(int[] nums) {
        int uniquePos = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[uniquePos] != nums[i]) {
                nums[++uniquePos] = nums[i];
            }
        }
        return uniquePos+1;
    }

    //2ms
    public static int removeDuplicates2(int[] nums) {
        Set<Integer> setNums = new HashSet<>();
        int uniquePos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!setNums.contains(nums[i])) {
                setNums.add(nums[i]);
                nums[uniquePos++] = nums[i];
            }
        }
        return uniquePos;
    }

    //very easy, but very long
    public static int removeDuplicates3(int[] nums) {
        List<Integer> t = Arrays.stream(nums).boxed().distinct().collect(Collectors.toList());
        int i = 0;
        for (Integer num : t) {
            nums[i++] = num;
        }
        return t.size();
    }

}
