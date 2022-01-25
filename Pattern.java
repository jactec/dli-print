public class Pattern {
    public static void main(String[] args) {

        for (int fn = 1; fn < 10; fn++) {
            for (int sn = 1; sn < 10; sn++) {
                int res = fn * sn;
                System.out.println(fn + "x" + sn + " = " + res);
            }
        }
    }
}
