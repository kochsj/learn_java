package models;

public class Door {
    private String material;
    private String color;
    private String action;


    public Door(String material, String color, String action) {
        this.material = material;
        this.color = color;
        this.action = action;
    }

    public void open() {
        // we *push* a Door open here
        System.out.println(this.action + " the " + this.material + " " + this.color + " door open");
    }
}