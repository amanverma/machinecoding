package StackProblems;

import java.util.Stack;

//remove redundant braces from String.
/*
* Input:
((a+b))
(a+(b)/c)
(a+b*(c-d))
Output:
Yes
Yes
No
* */
//Algo
/*
* stack = []
* if element = (+-*\ push into stack
* if element = ) then pop and if top is ( then redundant else not.
* */
public class RedundantBraces {

    public static void main(String[] args) {
        System.out.println(checkRedundantBraces("(a+(b)/c)"));
        System.out.println(checkRedundantBraces("((a+b))"));
        System.out.println(checkRedundantBraces("(a+b*(c-d))"));
    }

    private static boolean checkRedundantBraces(String s) {
        Stack<Character> s1 = new Stack<>();
        char[] t = s.toCharArray();
        for (char ch : t) {
            if (ch=='(' || ch=='+'|| ch=='-' || ch=='-' || ch=='*'){
                s1.push(ch);
            }
            if(ch==')'){
                char top = s1.peek();
                if (top=='(')
                        return true;
                while(top!='('){
                    top = s1.pop();
                }
            }
        }
        return false;

    }
}
