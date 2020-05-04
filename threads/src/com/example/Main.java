package com.example;

public class Main {

    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        obj2.start();
        System.out.println();
    }
}

class Hi extends Thread{
    public void run(){
        for (int i=0;i<5;i++) {
            System.out.println("Hi");
           try{ Thread.sleep(500);}catch (Exception e){}
        }
    }

}

class Hello extends Thread{
    public void run(){
        for (int i=0;i<5;i++) {
            System.out.println("Hello");
            try{ Thread.sleep(500);}catch (Exception e){}
        }
    }


}