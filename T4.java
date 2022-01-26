public class T4 {
    public static void main(String[] args) {
        float sum = 0;
        for (int i = 1; i <= 10; i++) {
            float v = i;
            float num = 1 / (v * (v + 1));
            sum = sum + num;
        }
        System.out.println(sum);

    }

}
