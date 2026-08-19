class Solution {
    public int[] sortedSquares(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int[] newarr=new int[nums.length];
        int k=nums.length-1;
        while(low<=high){
            int sq1=nums[low]*nums[low];
            int sq2=nums[high]*nums[high];
            if(sq1>sq2){
                newarr[k]=sq1;
                k--;low++;

            }else{
                newarr[k]=sq2;
                k--;high--;

            }
        }
        return newarr;
        
    }
}