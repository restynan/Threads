package com.example;

public class Main {

    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.show();
        obj2.show();
    }
}

class Hi{
    public void show(){
        for (int i=0;i<5;i++) {
            System.out.println("Hi");
        }
    }

}

class Hello{
    public void show(){
        for (int i=0;i<5;i++) {
            System.out.println("Hello");
        }
    }


}