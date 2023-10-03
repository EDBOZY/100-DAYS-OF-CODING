// 150. Evaluate Reverse Polish Notation

// Medium
// Topics
// Companies
// You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

// Evaluate the expression. Return an integer that represents the value of the expression.

// Note that:

// The valid operators are '+', '-', '*', and '/'.
// Each operand may be an integer or another expression.
// The division between two integers always truncates toward zero.
// There will not be any division by zero.
// The input represents a valid arithmetic expression in a reverse polish notation.
// The answer and all the intermediate calculations can be represented in a 32-bit integer.
 


                                                                                    //ANSWER

// So basically this is a very simple logic question where we should use the logic of stack.Particularly the pop and push function.We should wisely use the pop function whenever we encounter a special character in the iteration.

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> a=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int b=a.pop()+a.pop();
                a.push(b);
            }
            else if(tokens[i].equals("-")){
                int b=a.pop();
                int c=a.pop();
                int d=c-b;
                a.push(d);
            }
            else if(tokens[i].equals("*")){
                int b=a.pop()*a.pop();
                a.push(b);
            }
            else if(tokens[i].equals("/")){
                int b=a.pop();
                int c=a.pop();
                int d=c/b;
                a.push(d);
            }
            else{
                int b=Integer.valueOf(tokens[i]);
                a.push(b);
            }
        }
        return a.pop();
        
    }
}
