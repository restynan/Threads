package com.example;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here



        Thread t1 = new Thread(()->{

            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try { Thread.sleep(500); } catch (Exception e) { }
            }

        }
        ,"Hello-thread");
        Thread t2 = new Thread(()->{

            for (int i = 0; i < 5; i++) {
                System.out.println("Hi " +Thread.currentThread().getPriority());
                try { Thread.sleep(500); } catch (Exception e) { }
            }

        },"Hi-thread"
        );

//        t1.setPriority(1);
//        t2.setPriority(10);

           t1.setPriority(Thread.MIN_PRIORITY);
           t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start();
        try { Thread.sleep(10); } catch (Exception e) { }
        t2.start();

        t1.join();
        t2.join();   // bye will be printed after t1 and t2 have finished
        System.out.println("Bye");
        System.out.println(t1.isAlive());// used to detect if the thread is in the running state on Not


    }
}
