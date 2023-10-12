// 55. Jump Game

// You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

// Return true if you can reach the last index, or false otherwise


class Solution {
    public boolean canJump(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(i>a){
                return false;
            }
            else{
                a=Math.max(a,i+nums[i]);
            }
        }
        return true;
    }
}
