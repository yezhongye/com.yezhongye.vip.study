package com.dongnao;

import org.junit.Test;

/**
 * @author zjx
 * @Date: 2022/11/11
 */
public class ThreadWait {

    /*
     * 两个线程 一个线程输出 a b c d e f 一个线程输出 1 2 3 4 5 交叉输出 a 1 b 2 c 3
     */
    static boolean flag = false;
    @Test
    public void myTest() throws InterruptedException {

        int i1 = Runtime.getRuntime().availableProcessors();
        System.out.println("=================="+i1);
        Object o = new Object();



        Thread t1;

        t1 = new Thread(() -> {
            for (int i = 0; i < 26; ) {
                synchronized (o) {
                    if (!flag) {
                        char t = (char) (i + (int) 'a');
                        System.out.print(t);
                        i++;
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        flag = false;
                        o.notifyAll();

                    }

                }
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }


        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 26; ) {
                synchronized (o) {

                    if (flag) {
                        try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                        System.out.println(i);
                        i++;
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    flag = true;
                    o.notifyAll();
                }
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }

        });

        t1.start();
        t2.start();
        Thread.sleep(20000);
    }

    @Test
    public void youTest(){
        System.out.println((char)98);
    }

}
