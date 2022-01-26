
// 题目：求1+2!+3!+…+20!的和

public class T5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            int itemValue = 1;
            for (int j = i; j >= 1; j--) {
                itemValue = itemValue * j;
            }
            System.out.println(itemValue);
        }
    }
}
