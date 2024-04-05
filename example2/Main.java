package example2;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new One());
        Thread t2 = new Thread(new Two());
        t1.start();
        t2.start();
    }
}
