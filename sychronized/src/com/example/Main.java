package com.example;

import com.sun.source.tree.SynchronizedTree;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
         A obj= new A();
        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<1000;i++){
                           obj.increment();
                        }
                    }
                }
        );


        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<10000;i++){
                            obj.increment();
                        }
                    }
                }
        );

t1.start();
t2.start();
t1.join();
t2.join();
System.out.println(obj.count);
    }
}

class A{
    int count;
    public synchronized void increment(){//sychronized---only on thread can access the method and the other has to wait
        count++;

    }
}