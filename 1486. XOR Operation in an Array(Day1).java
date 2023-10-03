//1486. XOR Operation in an Array

// You are given an integer n and an integer start.

// Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.

// Return the bitwise XOR of all elements of nums.


                                                                                                      //ANSWERS

//Basically we are just using simple brute force type question here.Iterate thorugh and add each elements then do the XOR operation after all elements have been added.

  


class Solution {
    public int xorOperation(int n, int start) {
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            //a[i]=start;
            a[i]=start+2*i;
        }
        int c=0;
        for(int i=0;i<n;i++){
            c=c^a[i];
        }
        return c;
        
    }
}
