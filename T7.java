import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 
 * HINT: 在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，
 * 取得的余数作为下一轮循环的较小的数，如此循环直到较小的数的值为0，返回较大的数，此数即为最大公约数，最小公倍数为两数之积除以最大公约数
 * 
 */

public class T7 {
    public static void main(String[] args) {

        int M = 64;
        int N = 128;

        getHighestFactor(N);
        getHighestFactor(M);
    
    }

    private static List<Integer> getHighestFactor(int theNumber) {
        List<Integer> factors = new ArrayList<Integer>();
        for (int factor = 1; factor < theNumber / 2; factor++) {
            if (theNumber % factor == 0) {
                factors.add(factor);
            }
        }
        int lastElementOfArray = factors.get(factors.size() - 1);
        p(lastElementOfArray);
        return factors;
    }

    private static void p(Object object) {
        System.out.println(object);
    }

}
