/**
 * The Person class models a person with a name and address.
 */
public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    // Constructor
    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + home;
    }
}