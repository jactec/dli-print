
// 题目：求1+2!+3!+…+20!的和

public class T5 {
    public static void main(String[] args) {
        double sum = 0;
        for (double index = 1; index <= 20; index++) {
            double itemValue = 1;
            for (double number = index; number >= 1; number--) {
                itemValue = itemValue * number;
            }
            sum = sum + itemValue;
        }
        System.out.println(sum);
    }
}
