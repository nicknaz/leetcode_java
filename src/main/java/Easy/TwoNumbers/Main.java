package Easy.TwoNumbers;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] answer = twoSum(new int[]{0,3,-3,4,-1}, -1);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Set lst = new HashSet<Integer>();
        int result = -1;

        for (int i = 0; i < nums.length; i++) {
            if (lst.contains(target - nums[i]) && result == -1) {

            } else if (result != -1 && nums[result] + nums[i] == target){
                return new int[]{i, result};
            }
            lst.add(nums[i]);
        }

        return null;
    }

}
