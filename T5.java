
// 题目：求1+2!+3!+…+20!的和

public class T5 {
    public static void main(String[] args) {
        double sum = 0;
        double valueOfItem = 1;
        for (double i = 1; i <= 20; i++) {
            for (double n = i; n >= 1; n--) {
                valueOfItem = n * valueOfItem;
            }
            sum = sum + valueOfItem;
        }
        System.out.println(sum);
    }
}