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

        int m = 185;
        int n = 164;

        List<Integer> factorsOfM = getFactors(m);
        List<Integer> factorsOfN = getFactors(n);

        int hfom = getHighestFactor(factorsOfM);
        int hfon = getHighestFactor(factorsOfN);
        
        print(hfom);
        print(hfon);
        
        //for (int i = hfon; /*loop the factors of n from largest to smallest */){
          //  for (/*loop the factors of m from largest to smallest*/){
            //    /*check if the two factors match*/
           // }
        //}
        }

    private static int getHighestFactor(List<Integer> factors) {
        int lastIndex = factors.size() - 1;
        int lastElement = factors.get(lastIndex);
        return lastElement;
    }

    private static List<Integer> getFactors(int theNumber) {
        List<Integer> factors = new ArrayList<Integer>();
        for (int factor = 1; factor < theNumber / 2; factor++) {
            if (theNumber % factor == 0) {
                factors.add(factor);
            }
        }
        return factors;
    }

    private static void print(Object object) {
        System.out.println(object);
    }
}
