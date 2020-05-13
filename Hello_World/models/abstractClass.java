package models;

abstract class abstractClass {
    abstract void abstractMethod(); 
    void concreteMethod() { // concrete methods are still allowed in abstract classes 
        System.out.println("This is a concrete method."); 
    } 
}


// interfaces have no set fields / methods

// public interface interfaceY {
//     String name;
//     abstract void abstractMethod(); 
//     abstract void notImplemented();
// }