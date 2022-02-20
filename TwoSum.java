import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {3,2,4};
        int target = 6;
        int[] answer = solution.twoSum(nums, target);
        System.out.println("["+answer[0]+","+answer[1]+"]");
    }

}


class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] indexNums = new int[2];
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] > target){
                continue;
            }
            for (int i = j+1; i < nums.length; i++) {
                if(nums[i] > target){
                    continue;
                }
                if(nums[i] > target - nums[j]){
                    continue;
                }
                if(nums[i] == target - nums[j]){
                    indexNums[1] = i;
                    indexNums[0] = j;
                }            
            }
        }   
     
        return indexNums;
    }
}