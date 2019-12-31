package t1;

import java.util.HashMap;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        int[] sum = new Solution().twoSum(new int[]{0,4,3,0}, 0);
        System.out.println(sum[0]);
        System.out.println(sum[1]);
    }
    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     *
     * 示例:
     *
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     **/
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                int tmp = target - num;
                if (map.containsKey(tmp)){
                    return new int[]{map.get(tmp),i};
                }
                map.put(num,i);
            }
            return new int[]{};
        }
    }
}
