import models.CarDoor;
import models.Door;
import models.ScreenDoor;

public class Inheritance {
    public static void main(String[] args) {
        Door houseDoor = new Door("wood", "red", "Pushing");
        Door slidingDoor = new ScreenDoor("plastic", "brown", "Sliding");
        Door carDoor = new CarDoor("metal", "blue", "Pulling");

        houseDoor.open();
        slidingDoor.open();
        carDoor.open();
    }
}