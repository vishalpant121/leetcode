package leetcode;

class KokoEats {

    public static void main(String[] args) {

        int[] arr = {3, 6,7, 11};
        int h = 8;

        int[] arr2 = {873375536,395271806,617254718,970525912,634754347,824202576,694181619,20191396,886462834,
                442389139,572655464,438946009,791566709,776244944,694340852,419438893,784015530,588954527,282060288,
                269101141,499386849,846936808,92389214,385055341,56742915,803341674,837907634,728867715,20958651,167651719,
                345626668,701905050,932332403,572486583,603363649,967330688,484233747,859566856,446838995,375409782,220949961,
                72860128,998899684,615754807,383344277,36322529,154308670,335291837,927055440,28020467,558059248,999492426,991026255,
                30205761,884639109,61689648,742973721,395173120,38459914,705636911,30019578,968014413,126489328,738983100,793184186,
                871576545,768870427,955396670,328003949,786890382,450361695,994581348,158169007,309034664,388541713,142633427,390169457,
                161995664,906356894,379954831,448138536};
        int h2 = 943223529;


        int[] arr3 = {1,1,1,999999999};
        int h3 = 10;

        int[] arr4 ={805306368,805306368,805306368};
        int h4= 1000000000;

        System.out.println(minEatingSpeed(arr4, h4));
        System.out.println(minEatingSpeed2(arr4, h4));

    }



    public static int minEatingSpeed(int[] piles, int h) {

        int max = piles[0];
        for(int i=1; i< piles.length; i++) {
            if(piles[i] > max)
                max = piles[i];
        }
        long start = 1, end = max, mid;
        while(start <end) {
            mid = start + (end - start)/2;
            long totalcount = 0;
            for (int pile : piles) {
                long count = (long) pile / mid;
                if (pile % mid > 0)
                    count++;
                totalcount += count;
            }
            if(totalcount <= h)
                end = mid;
            else
                start = mid +1;
        }
        return (int)start;
    }


    public static int minEatingSpeed2(int[] piles, int H) {
        int l = 1, r = 1000000000;
        while (l < r) {
            int m = (l + r) / 2, total = 0;
            for (int p : piles)
                total += (p + m - 1) / m;
            if (total > H)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }
}