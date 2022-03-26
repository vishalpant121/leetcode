package leetcode;

public class CountPrimes {

    public static void main(String[] args) {


        System.out.println(countPrimes(9));
    }


    public static int countPrimes(int n) {
        int count = 0, sum, temp;
        for (int k = 2; k < n; k++) {
            if (k == 2 || k == 3)
                count++;
            else {
                sum = 0;
                temp = k;
                while (temp != 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
                if (sum % 3 != 0)
                    count++;
                System.out.println(k + " " + count);

            }
        }
        return count;
    }

        public static int countPrimesOld(int n) {

        int count =0, flag = 0;
        if(n <2)
            return 0;

        for(int k =2; k< n; k++) {
            flag = 0;
            if(k == 2 || k==3)
                count++;
            else {
                for (int i = 2; i <= Math.sqrt(k); i++) {
                    if (k % i == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    count++;
            }
            System.out.println(k + " " + count);
        }
                return count;
    }
}

