package com.pattern;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();//启动电脑
        System.out.println("------------------------------------------");
        computer.shutdown();//关闭电脑
    }
}
