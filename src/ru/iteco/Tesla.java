package ru.iteco;

public class Tesla extends Cars{
    private int intensity;
    private String chargingType;

    public String getChargingType() {
        return this.chargingType;
    };
    public void setChargingType(String type) {
        this.chargingType = type;
    };
    public int getIntensity() {
        return this.intensity;
    };
    public void setIntensity(int n) {
        this.intensity = n;
    };

    public Tesla(int intensity,String chargingType, String name,String equipment){
        super(name,equipment);
        this.intensity = intensity;
        this.chargingType = chargingType;
    }
    public Tesla(){
        this.intensity = 50000;
        this.chargingType = "TypeC";
    }
    @Override
    public void printInfo(){
        System.out.println("Привет я Тесла и моя мощность акума " + this.intensity + " у меня такой тип зарядки " + this.chargingType + " я в такой форме " + getEquipment());
    }
}
