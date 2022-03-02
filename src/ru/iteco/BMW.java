package ru.iteco;

public class BMW extends Cars {
    private int fuel;
    private String engine;

    public String getEngine() {
        return this.engine;
    };
    public void setEngine(String type) {
        this.engine = type;
    };
    public int getFuel() {
        return this.fuel;
    };
    public void setFuel(int n) {
        this.fuel = n;
    };

    public BMW(int fuel,String engine, String name,String equipment){
        super(name,equipment);
        this.fuel = fuel;
        this.engine = engine;
    }
    public BMW(){
        this.fuel = 50;
        this.engine = "HR16DE";
    }
    @Override
    public void printInfo(){
        System.out.println("Привет я BMW объем бака у меня " + this.fuel + " мой двигатель " + this.engine  + " я в такой форме " + getEquipment());
    }
}
