package com.yolanda.Komposisi;

public class DemoComputer {
    public static void main(String[] args) {

        Computer computer = new Computer("Gaming");

        Keyboard keyboard = new Keyboard("Rexus", "Mechanical");
        Mouse mouse = new Mouse("Logitech", "800");
        Monitor monitor = new Monitor("Armageddon", "24", "144");
        Cpu cpu = new Cpu("Intel i7","NVIDIA 3070","16");

        computer.addComponent(keyboard,mouse,monitor,cpu);

        System.out.println("Type Computer\t: "+ computer.getType());
        System.out.println();

        System.out.println("Keyboard\t: ");
        computer.getKeyboard().PrintSpec();

        System.out.println("Mouse\t: ");
        computer.getMouse().PrintSpec();

        System.out.println("Monitor\t: ");
        computer.getMonitor().PrintSpec();

        System.out.println("Cpu\t: ");
        computer.getCpu().PrintSpec();
    }
}
