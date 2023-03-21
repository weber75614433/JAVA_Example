package com.abc.demo;

public class Testing implements TestingInterface{
    String string;

    public Testing(String str){
        this.string = setString(str);
    }

    @Override
    public String setString(String str) {
        return str;
    }

    @Override
    public void print() {
        System.out.println(string);
    }
}
