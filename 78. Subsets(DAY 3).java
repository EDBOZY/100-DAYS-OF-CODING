// 78. Subsets

// Given an integer array nums of unique elements, return all possible 
// subsets
//  (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.


                                                                                        //ANSWER
// I used basic backtracting and recursion here


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        //List<Integer> inside=new ArrayList<>();
        
        bt(list,new ArrayList<>(),nums,0);
        return list;

        
    }
    public void bt(List<List<Integer>> list,List<Integer> inside,int [] nums,int start){
        list.add(new ArrayList<>(inside));
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

