// 131. Palindrome Partitioning

// Given a string s, partition s such that every 
// substring
//  of the partition is a 
// palindrome
// . Return all possible palindrome partitioning of s.


                                                                                                    //ANSWERS
  //SIMPLE BACKTRACKING IS USED HERE




class Solution {
    public boolean palindrome(String strr,int start,int end){
        while(start<=end){
            if(strr.charAt(start)!=strr.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public void pd(int index,List<List<String>>a,List<String> b,String str){
        if(index==str.length()){
            a.add(new ArrayList<>(b));
            return;
        }
        for(int i=index;i<str.length();i++){
            if(palindrome(str,index,i)){
                b.add(str.substring(index,i+1));
                pd(i+1,a,b,str);
                b.remove(b.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>a=new ArrayList<>();
        List<String> b=new ArrayList<>();
        pd(0,a,b,s);
        return a;
    }
}
