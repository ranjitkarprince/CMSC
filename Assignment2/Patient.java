/*
 * Class: CMSC203
 * Instructor: Ahmed Tarek
 * Description: This class represents a patient and stores the patient's
 *              personal information, address, phone number, and
 *              emergency contact information.
 * Due: 09/30/2026
 * Platform/compiler: Eclipse / Java
 *
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Print your Name here: Prince Ranjitkar
 */

public class Patient {

    // Patient information
    private String firstName;
    private String middleName;
    private String lastName;

    // Address information
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    // Contact information
    private String phoneNumber;

    // Emergency contact information
    private String emergencyName;
    private String emergencyPhone;

    /*
     * No-argument constructor.
     * Initializes all attributes to empty strings.
     */
    public Patient() {
        firstName = "";
        middleName = "";
        lastName = "";
        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
        phoneNumber = "";
        emergencyName = "";
        emergencyPhone = "";
    }

    /*
     * Constructor that initializes the patient's first,
     * middle, and last names.
     */
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
        phoneNumber = "";
        emergencyName = "";
        emergencyPhone = "";
    }

    /*
     * Constructor that initializes all patient attributes.
     */
    public Patient(String firstName, String middleName, String lastName,
                   String streetAddress, String city, String state,
                   String zipCode, String phoneNumber,
                   String emergencyName, String emergencyPhone) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyName = emergencyName;
        this.emergencyPhone = emergencyPhone;
    }

    /*
     * Returns the patient's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /*
     * Changes the patient's first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /*
     * Returns the patient's middle name.
     */
    public String getMiddleName() {
        return middleName;
    }

    /*
     * Changes the patient's middle name.
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /*
     * Returns the patient's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /*
     * Changes the patient's last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*
     * Returns the patient's street address.
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /*
     * Changes the patient's street address.
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /*
     * Returns the patient's city.
     */
    public String getCity() {
        return city;
    }

    /*
     * Changes the patient's city.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /*
     * Returns the patient's state.
     */
    public String getState() {
        return state;
    }

    /*
     * Changes the patient's state.
     */
    public void setState(String state) {
        this.state = state;
    }

    /*
     * Returns the patient's ZIP code.
     */
    public String getZipCode() {
        return zipCode;
    }

    /*
     * Changes the patient's ZIP code.
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /*
     * Returns the patient's phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /*
     * Changes the patient's phone number.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /*
     * Returns the emergency contact name.
     */
    public String getEmergencyName() {
        return emergencyName;
    }

    /*
     * Changes the emergency contact name.
     */
    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    /*
     * Returns the emergency contact phone number.
     */
    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    /*
     * Changes the emergency contact phone number.
     */
    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    /*
     * Builds and returns the patient's full name.
     */
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    /*
     * Builds and returns the patient's complete address.
     */
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    /*
     * Builds and returns the emergency contact information.
     */
    public String buildEmergencyContact() {
        return emergencyName + " " + emergencyPhone;
    }

    /*
     * Returns all information about the patient.
     */
    @Override
    public String toString() {
        return "Patient Name: " + buildFullName()
                + "\nAddress: " + buildAddress()
                + "\nPhone Number: " + phoneNumber
                + "\nEmergency Contact: " + buildEmergencyContact();
    }
}