package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread obj1 =new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("one");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread obj2 =new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("two");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        obj1.start();
        obj1.setPriority(Thread.MIN_PRIORITY);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread one Name: " + obj1.getPriority());//check the status of a thread by using isAlive method
        obj2.start();
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.join();//wait main thread until the obj1 thread and obj2 thread end the execution
        obj2.join();
        System.out.println("Thread one Status " + obj1.getPriority());

        System.out.println("Bye");
    }
}
