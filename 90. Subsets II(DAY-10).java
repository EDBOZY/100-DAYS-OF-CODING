// 90. Subsets II

// Given an integer array nums that may contain duplicates, return all possible 
// subsets
//  (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.


                                                                                          //ANSWERS
// SIMPLE BACKTRACKING


class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        
        bt(list,new ArrayList<>(),nums,0);
        return list;


        
    }
    public void bt(List<List<Integer>> list,List<Integer> inside,int [] nums,int start){
        if(list.contains(inside)==false){
            list.add(new ArrayList<>(inside));
        }
        
        if(start==nums.length){
            return;
        }
        
        for(int i=start;i<nums.length;i++){
            inside.add(nums[i]);
            bt(list,inside,nums,i+1);
            inside.remove(inside.size()-1);
            
        }

    }
}
