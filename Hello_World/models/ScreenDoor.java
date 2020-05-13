package models;

public class ScreenDoor extends Door {
    public ScreenDoor(String material, String color, String action) {
        super(material, color, action);
        this.material = material;
        this.color = color;
        this.action = action;
    }

    private String material;
    private String color;
    private String action;
}