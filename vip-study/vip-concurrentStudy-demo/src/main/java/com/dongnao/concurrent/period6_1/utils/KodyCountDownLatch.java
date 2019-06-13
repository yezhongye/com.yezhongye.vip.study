package com.dongnao.concurrent.period6_1.utils;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class KodyCountDownLatch {
    private Sync sync;

    public KodyCountDownLatch(int count){
        if (count < 0)
            throw new IllegalMonitorStateException("count < 0");
        this.sync = new Sync(count);
    }

    public void countDown(){
        sync.releaseShared(1);
    }

    public void await(){
        sync.acquireShared(1);
    }



}

class Sync extends AbstractQueuedSynchronizer {

    //存储倒计数的起点
    Sync(int count){
        setState(count);
    }

    //await就是抢占共享锁,当state变为0的时候，就结束等待
    @Override
    protected int tryAcquireShared(int arg) {
        return getState()==0 ? 1 : -1;
    }

    //释放锁，就是讲count值减1
    @Override
    protected boolean tryReleaseShared(int arg) {
        //用CAS自旋执行count-1，
        for(;;){
            int ct = getState();
            int nextc = ct -1;

            //count-1 执行成功是，若新的count=0，则返回true
            if (compareAndSetState(ct, nextc)){
               return nextc ==0;
            }
        }
    }
}
