package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class ValidAnagram {


    public static void main(String[] args) {

        String s = "anagram", t = "nagaram";

        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t) {


        HashMap<Character, Integer> map1 = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            if(map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            } else {
                map1.put(s.charAt(i), 1);
            }
        }

        for(int i=0; i<t.length(); i++) {
            if(map1.containsKey(t.charAt(i))) {
                map1.put(s.charAt(i), map1.get(s.charAt(i)) - 1);
            } else {
                return false;
            }
        }

        Set<Character> keyset = map1.keySet();

        for(Character key: keyset) {
            if(map1.get(key) != 0) {
                return false;
            }
        }


        return true;

    }

    public static boolean otherway(String s, String t) {

        if(s.length() != t.length())
            return false;

        if(s.length() == 1) {
            return s.charAt(0) == t.charAt(0);
        }

        String[] sList = s.split("");
        String[] tList = t.split("");

        Arrays.sort(sList);
        Arrays.sort(tList);

        for(int i=0; i<s.length(); i++) {
            if(!sList[i].equals(tList[i])) {
                return false;
            }
        }

        return true;

    }
}
