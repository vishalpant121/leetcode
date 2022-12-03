package leetcode;

import java.util.ArrayList;
import java.util.Stack;

//https://leetcode.com/problems/online-stock-span/
public class OnlineStock {

    public static void main(String[] args) {

        OnlineStock stockSpanner = new OnlineStock();
        System.out.println(
        stockSpanner.next(100) + " " +
        stockSpanner.next(80) + " " +
        stockSpanner.next(60)  + " " +
        stockSpanner.next(70)  + " " +
        stockSpanner.next(60)  + " " +
        stockSpanner.next(75) +  " " +
        stockSpanner.next(85)          );
    }



    //Et tu Brute
    /*ArrayList<Integer> arrayList;

    public OnlineStock() {
        arrayList = new ArrayList<>();
    }

    public int next(int price) {
        int span = 1;
        if(!arrayList.isEmpty()) {
            for(int i = arrayList.size() -1; i >=0; i--) {
                if (arrayList.get(i) <= price)
                    span++;
                else {
                    break;
                }
            }
        }
        arrayList.add(price);
        return span;
    }*/


    Stack<Integer[]> stack;

    public OnlineStock() {
        this.stack = new Stack<>();
    }

    public int next(int price) {
        int span =1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        stack.push(new Integer[] {price, span});
        return span;
    }

}
