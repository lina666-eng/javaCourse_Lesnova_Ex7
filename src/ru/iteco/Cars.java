package ru.iteco;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Cars {
    private String name;
    private String equipment;
    public String getEquipment() {
        return this.equipment;
    };
    public void setEquipment(String equip) {
        this.equipment = equip;
    };
    public String getName() {
        return this.name;
    };
    public void setName(String n) {
        this.name = n;
    };

    public Cars(String name,String equipment){
        this.name = name;
        this.equipment = equipment;
    }
    public Cars(){
        this.name = "name";
        this.equipment = "equipment";
    }
    public abstract void printInfo();

}

