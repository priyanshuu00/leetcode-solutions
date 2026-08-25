class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int i=1;i<=nums.length+1;i++)
        {
            int mul=k*i;
            boolean found=false;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==mul){
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                return mul;
            }
        }
        return -1;
    }
}