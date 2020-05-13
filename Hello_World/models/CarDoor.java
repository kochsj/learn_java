package models;

public class CarDoor extends Door {
    public CarDoor(String material, String color, String action){
        super(material, color, action);
        this.material = material;
        this.color = color;
        this.action = action;
    }

    private String material;
    private String color;
    private String action;
    
}