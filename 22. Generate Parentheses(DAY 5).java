// 22. Generate Parentheses

// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.


                                                                                                //ANSWER
// I performed backtracking here also.

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        bt(list,"",0,0,n);
        return list;
        
    }
    public void bt(List<String>list,String str,int open,int close,int t){
        if(str.length()==t*2){
            list.add(str);
            return;
        }
        if(open<t){
            bt(list,str+'(',open+1,close,t);
        }
        if(close<open){
            bt(list,str+')',open,close+1,t);
        }
    }
}
