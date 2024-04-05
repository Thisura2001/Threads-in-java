package Example1;

public class Two extends Thread {
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println("two");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
