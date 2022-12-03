package leetcode;

import java.util.Stack;

//https://leetcode.com/problems/make-the-string-great/
public class MakeStringGreat {


    public static void main(String[] args) {
        String s = "leetcoOdeaaAbBcCA";

        System.out.println(makeGood(s));
        System.out.println(makeGood2(s));
    }

    private static String makeGood2(String s) {
        Stack<Character> stack = new Stack<>();

        int i=0;
        while(i < s.length()) {
            if(!stack.isEmpty() && Math.abs(stack.peek() - s.charAt(i)) == 32) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
            i++;
        }

        StringBuilder stringBuffer = new StringBuilder();

        while(!stack.isEmpty()) {
            stringBuffer.append(stack.pop());
        }

        return stringBuffer.reverse().toString();
    }
    private static String makeGood(String s) {

        StringBuilder stringBuffer = new StringBuilder(s);

        for(int i=0; i< stringBuffer.length() -1; ) {
            if(Math.abs(stringBuffer.charAt(i) - stringBuffer.charAt(i+1)) == 32) {
                stringBuffer.replace(i, i+2, "");
                i=0;
            } else
                i++;
        }
        return stringBuffer.toString();
    }
}
