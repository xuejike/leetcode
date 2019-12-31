package t645;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        int[] nums = new Solution().findErrorNums(new int[]{2,2,1});
        System.out.println(nums[0]);
        System.out.println(nums[1]);
    }

    static class Solution {
        public int[] findErrorNums(int[] nums) {
            byte[] ns = new byte[nums.length];
            int repNum = 0;
            for (int i : nums) {
                if (ns[i-1] == 1){
                    repNum = i;
                }
                ns[i-1] = 1;
            }
            int lost = 0;
            for (int i = 0; i < nums.length; i++) {
                if (ns[i] == 0){
                    lost = i+1;
                    break;
                }
            }

            return new int[]{repNum,lost};
        }
    }
}
