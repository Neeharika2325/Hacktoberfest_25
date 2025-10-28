class Solution {
    public int longestOnes(int[] nums, int k) {
        int len=0,maxlen=0,zeroes,i,j,n;
        n=nums.length;
        for(i=0;i<n;i++){
            zeroes=0;
            for(j=i;j<n;j++){
                if(nums[j]==0)
                zeroes++;
                if(zeroes<=k){
                    len=j-i+1;
                    maxlen=Math.max(maxlen,len);
                }
                else
                break;
            } }
            return maxlen;
    }
}
