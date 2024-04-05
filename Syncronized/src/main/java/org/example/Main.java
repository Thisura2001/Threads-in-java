package org.example;

class Calculations{
    int num;
    public void increment(){
        num++;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculations c = new Calculations();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count : "+c.num);
    }
}
