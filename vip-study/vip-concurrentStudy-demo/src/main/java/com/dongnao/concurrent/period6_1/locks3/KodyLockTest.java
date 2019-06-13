package com.dongnao.concurrent.period6_1.locks3;

import com.dongnao.concurrent.period6.locks2.KodyLock;

public class KodyLockTest {
    volatile static int i=0;

    static KodyLock lc = new KodyLock();

    public static void add(){
        lc.lock();
        i++;
        lc.unlock();
    }

    public static void main(String args[]) throws InterruptedException {
        for (int i=0; i<10; i++){
            new Thread(){
                @Override
                public void run() {
                    for (int j=0; j< 10000; j++){
                        //System.out.println(currentThread().getName()+ "....");
                        add();
                    }
                    System.out.println("done...");
                }
            }.start();
        }

        Thread.sleep(6000L);
        System.out.println(i);

    }
}
