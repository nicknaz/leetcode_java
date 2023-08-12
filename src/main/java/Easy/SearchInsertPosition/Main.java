package Easy.SearchInsertPosition;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{1,3,5,6};
        System.out.println("Answer: " + searchInsert(nums, 7));

    }

    public static int searchInsert(int[] nums, int target) {
        if (nums[0] >= target) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] < target && target <= nums[i]){
                return i;
            }
        }
        return nums.length;
    }

}
