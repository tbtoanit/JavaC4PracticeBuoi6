package DateTime;

import java.util.Date;

public class ThreadDemo {
    public static void main(String[] args) {
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println(new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
