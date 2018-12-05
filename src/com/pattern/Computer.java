package com.pattern;

/**
 * 电脑
 */
public class Computer {
    private CPU cpu = null;
    private Memory memory = null;
    private Disk disk = null;
    public Computer(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    /**
     * 启动电脑
     */
    public void start(){
        this.cpu.startCpu();
        this.memory.startMemory();
        this.disk.startDisk();
    }

    /**
     * 关闭电脑
     */
    public void shutdown(){
        this.cpu.shutdownCpu();
        this.memory.shutdownMemory();
        this.disk.shutdownDisk();
    }
}
