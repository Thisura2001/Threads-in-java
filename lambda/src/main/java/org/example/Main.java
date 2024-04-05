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
       Thread.sleep(100);
       obj2.start();
    }
}
