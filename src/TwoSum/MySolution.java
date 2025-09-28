package TwoSum;

class MySolution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[] {0, 0};
        for(; result[0] < nums.length ; result[0]++){
            for(result[1] = result[0] + 1; result[1] < nums.length ; result[1]++){
                if(nums[result[0]] + nums[result[1]] == target){
                    return result;  // 找到答案
                }
            }
        }
        return new int[]{}; // 沒找到
    }
}