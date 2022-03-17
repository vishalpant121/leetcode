package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class ConstructString {


    public static void main(String[] args) {
        ConstructString subString = new ConstructString();

        String ransomNote = "aa", magazine = "aab";

        System.out.println(subString.otherway(ransomNote, magazine));

    }


    public boolean canConstruct(String ransomNote, String magazine) {

        int[] array = new int[26];

        for(int i=0; i< ransomNote.length(); i++) {
            array[ransomNote.charAt(i) - 'a']++;
        }

        for(int i=0; i< magazine.length(); i++) {
            array[magazine.charAt(i) - 'a']--;
        }

        for(int i:array) {
            if(i > 0) {
                return false;
            }
        }
        return true;
        /*String[] ran = ransomNote.split("");
        String[] mag = magazine.split("");

        System.out.println(Arrays.toString(ran));
        System.out.println(Arrays.toString(mag));

        Arrays.sort(ran);
        Arrays.sort(mag);

        int i = 0;
        for(String s: ran) {
            if(i == mag.length) {
                return false;
            }
            while (!mag[i].equals(s)) {
                if(i == mag.length -1)
                    return false;
                i++;
            }
            i++;
        }


        return true;*/
    }



    public boolean otherway(String ransomNote, String magazine) {

        if(ransomNote.length() ==0 || magazine.length() == 0)
            return false;

        if(ransomNote.length() ==1 && magazine.length() ==1) {
            if(ransomNote.charAt(0) == magazine.charAt(0))
                return true;
            else
                return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0; i< magazine.length(); i++) {
            if(map1.containsKey(magazine.charAt(i))) {
                map1.put(magazine.charAt(i), map1.get(magazine.charAt(i)) + 1);
            } else {
                map1.put(magazine.charAt(i), 1);
            }
        }

        for(int i=0; i< ransomNote.length(); i++) {
            if(map1.containsKey(ransomNote.charAt(i))) {
                if(map1.get(ransomNote.charAt(i)) == 0) {
                    return false;
                }
                map1.put(ransomNote.charAt(i), map1.get(ransomNote.charAt(i)) -1);
            } else {
                return false;
            }
        }

        return true;
    }
}
