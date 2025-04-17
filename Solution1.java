class Solution {
    public int countPairs(int[] nums, int k) {
        int n=nums.length,cnt=0;
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j] && (i*j)%k==0)
                    cnt++;
            }
        }
        return cnt;
    }
}