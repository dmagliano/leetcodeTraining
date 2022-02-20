import java.util.Arrays;
import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {-3,2,3,4};
        int target = 0;
        int[] answer = solution.twoSum(nums, target);
        System.out.println("["+answer[0]+","+answer[1]+"]");
    }

}


class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] indexNums = new int[2];
        HashMap<Integer, Integer> indexes = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (indexes.containsKey(difference)){
                indexNums[0] = indexes.get(difference);
                indexNums[1] = i;
                break;
            }
            indexes.put(nums[i],i);
        }

        return indexNums;
    }
}