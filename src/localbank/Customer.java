/**
 * Customer class.
 */
package localbank;

public class Customer {

    private String firstName, lastName;
    private String street, city, state, zip;

    /**
     * constructor 
     * pre: none 
     * post: A Customer object has been created. Customer
     * data has been initialized with parameters.
     */
    public Customer(String fName, String lName, String street, String city, String state, String zip) {
        firstName = fName;
        lastName = lName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    /**
     * Changes the street detail for the customer's account
     * pre: The new street the customer resides in is required
     * post: street is changed
     */
    public void changeStreet(String newStreet) {
        street = newStreet;
    }

    /**
     * Changes the city detail for the customer's account
     * pre: The new city the customer resides in is required
     * post: city is changed
     */
    public void changeCity(String newCity) {
        city = newCity;
    }

    /**
     * Changes the state detail for the customer's account
     * pre: The new state the customer resides in is required
     * post: state is changed
     */
    public void changeState(String newState) {
        state = newState;
    }

    /**
     * Changes the zip code for the customer's account
     * pre: The new zip code is required
     * post: The zip code is changed
     */
    public void changeZip(String newZip) {
        zip = newZip;
    }

    /**
     * Returns a String that represents the Customer object. 
     * pre: none 
     * post: A string representing the Customer object has been returned.
     */
    public String toString() {
        String custString;
        custString = firstName + " " + lastName + "\n";
        custString += street + ", " + city + ", " + state + " " + zip + "\n";
        return (custString);
    }
}
