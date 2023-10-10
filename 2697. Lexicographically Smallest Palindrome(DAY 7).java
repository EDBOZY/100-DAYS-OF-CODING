// 2697. Lexicographically Smallest Palindrome

// You are given a string s consisting of lowercase English letters, and you are allowed to perform operations on it. In one operation, you can replace a character in s with another lowercase English letter.

// Your task is to make s a palindrome with the minimum number of operations possible. If there are multiple palindromes that can be made using the minimum number of operations, make the lexicographically smallest one.

// A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.

// Return the resulting palindrome string.


                                                                                        //ANSWERS
// Lexiograpy means changing values if not palindrome to the smallest one.


class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        int i=0;
        int j=arr.length-1;
        for(int m=0;m<arr.length/2;m++){
            if(arr[i]!=arr[j]){
                if(arr[i]<arr[j]){
                    arr[j]=arr[i];
                }
                else{
                    arr[i]=arr[j];
                }
                i++;
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        StringBuilder str = new StringBuilder();
        for (int ii = 0; ii < arr.length; ii++) {
            str.append(arr[ii]);
        }
        String a = str.toString();
        return a;


    }
}
