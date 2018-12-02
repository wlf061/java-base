package com.wlf.study.concurrency.chapter2;


import java.util.concurrent.atomic.AtomicInteger;

/*通过jps 查看进程，通过jstack 查看线程状态*/
public class BadSuspendThread {
    public static Object u = new Object();
    static ChangeObjectThread t1 = new ChangeObjectThread("t1");
    static ChangeObjectThread t2 = new ChangeObjectThread("t2");

    public static class ChangeObjectThread extends Thread{
        public ChangeObjectThread(String name){
            super.setName(name);
        }

        @Override
        public void run(){
            synchronized (u){
                System.out.println("in"+getName());
                Thread.currentThread().suspend();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        Thread.sleep(1000);
        t2.start();
        t1.resume();
        t2.resume();
        t1.join();
        t2.join();
    }
}
