# april17_2025
The problem that i solved today in leetcode

1.Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k.

Code:
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
