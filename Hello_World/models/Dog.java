package models;


// dog implements the Andimal interface - uses all methods. Animal is the *template*
public class Dog implements Animal{
    public boolean feed(boolean timeToEat) {
        return true;
    }
    public void pet(){
        // pet the dog
    }

    public void groom(){
        // groom the dog
    }
}