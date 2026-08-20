class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minimum=Integer.MAX_VALUE;
        int low=0;
        int sum=0;
        for(int high=0;high<nums.length;high++){
         sum=sum+nums[high];
            while(sum>=target){

            int length=high-low+1;
           minimum= Math.min(minimum,length);
            sum=sum-nums[low];
            low++;
            }
        }
        if(minimum==Integer.MAX_VALUE){
            return 0;
        }else{
            return minimum;
        }
        
    }
}