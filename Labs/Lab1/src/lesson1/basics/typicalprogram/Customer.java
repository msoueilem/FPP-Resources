package lesson1.basics.typicalprogram;

import static java.lang.String.format;

/**
 * Stores data for an address. In this application,
 * an Employee may have a home address and also a work Address.
 * @author Soueilem Mohamed Lemine
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer(String firstName, String lastName, String socSecurityNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSocSecurityNum() {
        return socSecurityNum;
    }
    public Address getBillingAddress() {
        return billingAddress;
    }
    public Address getShippingAddress() {
        return shippingAddress;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Provides a string representation of an address.
     * @return a string representation of an addresss
     */
    public String toString() {
        String format = "\nCustomer Info\nFirst Name: %s\nLast Name: %s\nSSN: %s\nAddress\nShipping Address: %s\nBilling Address: %s\n";
        return String.format(format,firstName,lastName,socSecurityNum,shippingAddress,billingAddress);
    }

}
