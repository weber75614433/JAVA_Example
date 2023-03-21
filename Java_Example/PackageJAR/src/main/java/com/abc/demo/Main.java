package com.abc.demo;
public class Main implements Runnable{

    public String setString(String str){
        return str;
    }

    public static void main(String[] args){
        new Main().run();
    }

    @Override
    public void run() {
        System.out.println(setString("123456"));
    }
}
