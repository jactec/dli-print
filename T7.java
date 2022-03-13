/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 
 * HINT: 在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，
 * 取得的余数作为下一轮循环的较小的数，如此循环直到较小的数的值为0，返回较大的数，此数即为最大公约数，最小公倍数为两数之积除以最大公约数
 * 
 */

public class T7 {
    
    public static void main(String[] args) {
        
        int M = 222;
        int N = 33;

        // The question is to get HCF and LCM, we will get HCF first, and we could get LCM out of HCF easily
        int hcf = getHCF(M, N);
        System.out.println("HCF: " + hcf);

        int lcm = getLCM(M, N, hcf);
        System.out.println("LCM: " + lcm);

    }

    /**
     * 1. Run to test the result.
     * 2. Try to run it manually in paper to see how it works
     */
    private static int getHCF(int m, int n) {
        int biggerNumber = Math.max(m, n);
        int smallerNumber = Math.min(m, n);
        int remainder = biggerNumber%smallerNumber;
        while(remainder!=0) {
            // print(biggerNumber + ", " + smallerNumber + ", " + remainder);
            remainder = biggerNumber%smallerNumber;
            if (remainder == 0) break;
            biggerNumber = smallerNumber;
            smallerNumber = remainder;
        }
        return smallerNumber;
    }


    /**
     * 1. Try to run it manually for multiple pars in paper, and try to understand how it works
     */
    private static int getLCM(int m, int n, int hcf) {
        return m*n/hcf;
    }
}
