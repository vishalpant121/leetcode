package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {

        int numRows = 10;

        System.out.println(generate(numRows));

    }


    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i< numRows; i++) {
            List<Integer> listRow = new ArrayList<>();
            list.add(listRow);
            for(int j=0; j<= i; j++) {
                if((j == 0) || (j == i)) {
                    list.get(i).add(1);
                } else {
                    list.get(i).add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
        }
        return list;
    }

}

