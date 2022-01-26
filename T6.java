

// 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米?

public class T6 {
    public static void main(String[] args) {
        double height = 100;
        double totalDistanceFell = 0;
        for (int i = 1; i <= 10; i++){
            height = height + height /2;
            totalDistanceFell = height;
        }
        System.out.println("total distance fallen by the ball = " + totalDistanceFell);
    }
}
