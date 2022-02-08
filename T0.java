import java.util.Date;

public class T0 {
    public static void main(String[] args) {
      Date now = new Date();
      int time = now.getHours();

      if (time <= 10) {
        System.out.println("Good morning.");
      } else if (time < 17) {
        System.out.println("Good afternoon.");
      } else {
        System.out.println("Good Night");
      }
    }
  }
  