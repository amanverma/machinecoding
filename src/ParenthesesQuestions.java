import java.util.Stack;

public class ParenthesesQuestions {
    public static void main(String[] args) {
//        System.out.println(isValid("()"));
//        System.out.println(isValid("()[]{}"));
//        System.out.println(isValid("(]"));
        System.out.println(isValid("{[]}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> s1 = new Stack();
        char[] chars = s.toCharArray();
        for(int i = 0 ; i < chars.length; i++){
            char c = chars[i];
            if(c==')' || c=='}' || c==']'){
                if(c==')'){
                    if(s1.peek()!='('){
                        return false;
                    }
                    s1.pop();
                }else if(c=='}'){
                    if(s1.peek()!='{') {
                        return false;
                    }
                    s1.pop();
                }
                else if(c==']'){
                    if(s1.peek()!='['){
                        return false;
                    }
                    s1.pop();
                }
            }else{
                s1.push(c);
            }
        }

        return s1.isEmpty();


    }
}
