package com.dongnao.concurrent.period4;

import java.util.concurrent.atomic.LongAccumulator;

public class Demo3_LongAccumulator {
    public static void main(String[] args) throws InterruptedException {

        LongAccumulator accumulator = new LongAccumulator(
                (x,y)->{
                    System.out.println("x:" + x);
                    System.out.println("y:" + y);
                    return  x+y;
                },
                0L);

        for (int i = 0; i < 3; i++) {
            accumulator.accumulate(1);
        }

        System.out.println(accumulator.get());

    }
}
