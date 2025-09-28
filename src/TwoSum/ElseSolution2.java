//討論區思路2 One-pass Hash Table
package TwoSum;

public class ElseSolution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{};
    }
}

//與 Two-pass 的差異在 "邊查邊存"
//先計算新的nums[i]的 complement
//如果 complement 沒在 hash table(存之前跑過的nums[i])中 則加入至 hash table 中
//有找到則代表有兩數相加等於 target

