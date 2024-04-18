package Example1;

public class main {
    public static void main(String[] args) throws InterruptedException {
        One one = new One();
        Two two = new Two();
        one.start();
        two.start();
        Thread.sleep(700);
    }
}
