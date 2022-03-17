package leetcode;

import java.util.HashSet;
import java.util.Stack;

public class ValidParenthesis {


    public static void main(String[] args) {


        System.out.println(isValid("[()]{}"));

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        Character character;

        for(int i=0; i< s.length(); i++) {

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                character = stack.pop();
                if(s.charAt(i) == ')' && character != '(') {
                    return false;
                } else  if(s.charAt(i) == '}' && character != '{') {
                    return false;
                } else  if(s.charAt(i) == ']' && character != '[') {
                    return false;
                }
            }
        }

        if(!stack.isEmpty()) {
            return false;
        }
        return true;

    }
}
