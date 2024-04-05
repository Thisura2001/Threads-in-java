package Example1;

public class One extends Thread {
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
