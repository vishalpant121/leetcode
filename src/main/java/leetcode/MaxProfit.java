package leetcode;


public class MaxProfit {


    public static void main(String[] args) {

        int[] input = {7,1,5,3,6,4};
        //int[] input = {7,6,4,3,1};

        System.out.println(maxProfit(input));
    }

    public static int maxProfit(int[] prices) {

        //brute
        //int profit = 0;
        /*for(int i=0; i< prices.length -1; i++) {
            for(int j=i+1; j< prices.length; j++) {
                if(profit < prices[j] - prices[i]) {
                    profit = prices[j] - prices[i];
                }
            }
        }*/

        //method 2
        if(prices.length <=1) {
            return 0;
        }  ///this condition reduced runtime from 3 to 1 ms
        int max_diff = 0;
        int min_element = prices[0];

        for(int i = 1; i< prices.length; i++) {
            if(prices[i] - min_element > max_diff) {
                max_diff = prices[i] - min_element;
            }
            if(prices[i] < min_element) {
                min_element = prices[i];
            }
        }

        /*for(int i = 1; i< prices.length; i++) {
            max_diff = Math.max(max_diff, prices[i] - min_element);
            min_element = Math.min(min_element, prices[i]);
        }*/




        return max_diff;
    }
}
