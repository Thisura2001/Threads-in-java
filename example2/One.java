package example2;

public class One implements Runnable {
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println("one");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
