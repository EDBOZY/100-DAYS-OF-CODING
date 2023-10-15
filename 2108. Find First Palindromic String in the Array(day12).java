// 2108. Find First Palindromic String in the Array
// Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

// A string is palindromic if it reads the same forward and backward.


class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isp(words[i])){
                return words[i];
            }
        } 
        return "";   
    }
    public boolean isp(String a){
        int m=a.length()/2;
        int c=a.length()-1;
        for(int i=0;i<m;i++){
            if(a.charAt(i)==a.charAt(c)){
                c--;
            }
            else{
                return false;
            }
        }
        return true;
    }
       
}
