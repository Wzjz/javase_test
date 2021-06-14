package com.test;

/**
 * @author Wzjz
 * @create 2021-06-14-23:14
 */
//创建线程方式一：继承Thread类 ,重写run()方法，调用start开启线程
//总结：线程开启不一定立即执行，由cpu调度调度执行
public class Thread_test extends Thread{
    @Override
    public void run(){
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我正在看代码--"+ i);
        }
    }

    public static void main(String[] args) {
        //main线程，主线程


        //创建一个线程对象
        Thread_test thread_test = new Thread_test();
        //调用start()方法开启线程
        thread_test.start();


        for (int i = 0; i < 200; i++) {
            System.out.println("我正在看多线程--"+i);
        }
    }
}
