package Example1;

public class main {
    public static void main(String[] args) throws InterruptedException {
        One one = new One();
        Two two = new Two();
        one.start();
        two.start();

        one.run();
        Thread.sleep(700);
        two.run();
    }
}
