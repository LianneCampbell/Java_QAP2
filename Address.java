/**
 * Name: Lianne Campbell
 * Project: Java QAP 2
 * Date: 5/28/2024
 * The Address class models an address with street, city, state, and zip code.
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}