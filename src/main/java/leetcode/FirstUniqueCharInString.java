package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class FirstUniqueCharInString {

    public static void main(String[] args) {

        String s = "loveleetcode";

        System.out.println(firstUniqChar(s));
    }


    public static int firstUniqChar(String s) {

        /*HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i< s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else
                map.put(s.charAt(i), 1);
        }

        for(int i=0; i< s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }*/

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Integer, Character> map2 = new HashMap<>();


        for(int i=0; i< s.length(); i++) {
            if(!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), i);
                map2.put(i, s.charAt(i));
            }
        }

        System.out.println(map1);
        System.out.println(map2);


        if(map2.size() == 0) {
            return -1;
        }
        return  map2.get(1);}
}
