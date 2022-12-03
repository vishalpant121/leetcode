package leetcode;

public class CeilingChar {

    public static void main(String[] args) {

        char[] input = { 'c', 'f', 'g'};
        char target = 'a';

        System.out.println(nextGreatestLetter(input, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0, end = letters.length -1;
        int mid;
        if(target >= letters[end]) {
            return letters[0];
        }
        while (start <= end) {
            mid = start + (end -start)/2;
            if(target < letters[mid]) {
                end = mid -1;
            } else if (target >= letters[mid]) {
                start = mid +1;
            }
        }

        return letters[start];
    }
}
