// 1493. Longest Subarray of 1's After Deleting One Element

// Given a binary array nums, you should delete one element from it.

// Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray




                                                                                                       //ANSWER



class Solution {
    public int longestSubarray(int[] nums) {
        int curr=0;
        int prev=0;int a=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curr++;
            }
            else{
                a=Math.max(a,prev+curr);
                prev=curr;
                curr=0;
            }
        }
        a=Math.max(a,prev+curr);
        if(a==nums.length){
            return a-1;
        }
        return a;
        
    }
}
