package org.ulpgc.is1.model;

public class Customer {

    private String name;
    private String surname;

    private Address address;

    public Customer(String name, String surname, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String street,  int number, int postalCode, String city) {
        this.address = new Address( street,   number,  postalCode,  city);

    }
}
