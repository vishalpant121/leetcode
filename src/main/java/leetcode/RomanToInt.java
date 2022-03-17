package leetcode;

import java.util.HashMap;

public class RomanToInt {


    public static void main(String[] args) {

        String s = "MCMXCIV";


        System.out.println(romanToInt(s));
    }


    public static int romanToIntNew(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int answer = 0, i;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(i=0; i<s.length()-1; i++) {

            if(s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
                answer-=2;
            } else if(s.charAt(i) == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) {
                answer-=20;
            } else if(s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
                answer-=200;
            }
            if(map.containsKey(s.charAt(i))) {
                answer+=map.get(s.charAt(i));
            }

        }

        if(map.containsKey(s.charAt(i))) {
            answer+=map.get(s.charAt(i));
        }

        return answer;


    }

    public static int romanToInt(String s) {

        int answer = 0;
        for(int i=0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I' -> answer++;
                case 'V' -> {
                    if(i-1 >=0 && s.charAt(i-1) == 'I')
                        answer+=3;
                    else
                        answer += 5;
                }
                case 'X' -> {
                    if(i-1 >=0 && s.charAt(i-1) == 'I')
                        answer+=8;
                    else
                        answer += 10;
                }
                case 'L' -> {
                    if(i-1 >=0 && s.charAt(i-1) == 'X')
                        answer+=30;
                    else
                        answer += 50;
                }
                case 'C' -> {
                    if(i-1 >=0 && s.charAt(i-1) == 'X')
                        answer+=80;
                    else
                        answer += 100;
                }
                case 'D' -> {
                    if(i-1 >=0 && s.charAt(i-1) == 'C')
                        answer+=300;
                    else
                        answer += 500;
                }
                case 'M' -> {
                    if(i-1 >=0 && s.charAt(i-1) == 'C')
                        answer+=800;
                    else
                        answer += 1000;
                }
            }
        }
        return answer;
    }


}
