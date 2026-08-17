class Solution {
    public int removeDuplicates(int[] nums) {
        int low=0;
        int high =1;

        while(high<nums.length){
            if(nums[high]==nums[high-1]){
                high++;
            }else{
                nums[low+1]=nums[high];
                low++;
                high++;
            }
        }
        return low+1;
        
    }
}