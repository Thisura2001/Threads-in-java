package Implement;

public class myClass {
    public static void main(String[] args) {
       runnable runnable = new runnable();
       Thread thread = new Thread(runnable);
       thread.start();
    }
}
