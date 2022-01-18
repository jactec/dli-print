public class T4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int num = 1/(i*(i+1));
            sum = sum + num;
        }
        System.out.println(sum);
    }

}
