// 974. Subarray Sums Divisible by K
// Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

// A subarray is a contiguous part of an array.


class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int s=0;
        int r=0;

        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
            r=s%k;
            if(r<0){
                r=r+k;
            }
            if(map.containsKey(r)){
                c=c+map.get(r);
                map.put(r,map.get(r)+1);
            }
            else{
                map.put(r,1);
            }
        }
        return c;
    }
}
