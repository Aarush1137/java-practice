package day02_arrays;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            int a=-1;
            int b=-1;
            for(int i=0;i<nums.length-1;i++){
                int diff = target - nums[i];
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j] == diff){
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{-1,-1};
        }
    }
