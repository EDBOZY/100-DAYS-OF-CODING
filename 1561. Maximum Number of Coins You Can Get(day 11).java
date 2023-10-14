// 1561. Maximum Number of Coins You Can Get

// There are 3n piles of coins of varying size, you and your friends will take piles of coins as follows:

// In each step, you will choose any 3 piles of coins (not necessarily consecutive).
// Of your choice, Alice will pick the pile with the maximum number of coins.
// You will pick the next pile with the maximum number of coins.
// Your friend Bob will pick the last pile.
// Repeat until there are no more piles of coins.
// Given an array of integers piles where piles[i] is the number of coins in the ith pile.

// Return the maximum number of coins that you can have.


class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int a=0;
        int c=0;
        int d=piles.length/3;
        for(int i=piles.length-2;i>=0;i=i-2){
            a=a+piles[i];
            c++;
            if(c==d){
                break;
            }
        }
        return a;

    }
}
