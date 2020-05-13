package models;

// with class constructor
// USUALLY: constructors are defined as public, variables are defined as private and methods are mixed
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        String fullName = firstName + " " + lastName;
        return fullName;
    }
    public void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
