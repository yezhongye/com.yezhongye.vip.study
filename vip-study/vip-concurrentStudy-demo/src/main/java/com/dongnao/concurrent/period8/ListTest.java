package com.dongnao.concurrent.period8;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

// List Set  Queue


public class ListTest {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");


        int i = 0;
//        for (String str : list){
//            if (i==0) list.add("99");
//            i++;
//        }



        //ArrayList线程不安全
        //读写锁   来封装ArrayList  线程安全的集合类
        //ReadWriteLock  能够提升ReentrantLock的性能
        //ReadWriteLock适合读多写少的场景
        //写获取写锁的时候，阻塞大量的读操作



        CopyOnWriteArrayList<String> list2 = new CopyOnWriteArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        list2.add("6");
        list2.get(3);
        list2.remove(1);

        int j = 0;
        for (String str : list2){
            if (j==0) list2.add("99");
            j++;
        }

        System.out.println(list2.toString());

    }
}
