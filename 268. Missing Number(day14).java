// 268. Missing Number
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.


                                                                                               //ANSWERS
//   I BASICALLY USED SIMPLE MATH FIND TOTAL SUM FOR 0 TO N ELEMENTS AND SUBTRACT WITH THE SUM OF THE ARRAY ELEMENTS



class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int cs=0;
        for(int i=0;i<n;i++){
            cs=cs+nums[i];
        }

        return(sum-cs);
        
    }
}
