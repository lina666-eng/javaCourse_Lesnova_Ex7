package ru.iteco;

public class Main {
    public static void main(String[] args){
        Tesla car1 = new Tesla(50000, "TypeC", "name", "equipment");
        BMW car2 = new BMW(50, "HR16DE","name", "equipment");
        car1.printInfo();
        car2.printInfo();
    }

}
