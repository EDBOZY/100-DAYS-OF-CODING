// 216. Combination Sum III

// Medium

// Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

// Only numbers 1 through 9 are used.
// Each number is used at most once.
// Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.




                                                                                        //ANSWER


// Basically we are performing backtracking here .




class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> result = new ArrayList();
        generate(1,9,new ArrayList(),result,k,n);
        return result;   
    }
    void generate(int start,int end,List<Integer> current,List<List<Integer>> result, int k,int target){
        
        if(target==0 && current.size()==k){
            result.add(new ArrayList(current));
            return;
        }
        for(int i=start;i<=end;i++){
            current.add(i);
            generate(i+1,end,current,result,k,target-i);
            current.remove(current.size()-1);


        }
    }
}
