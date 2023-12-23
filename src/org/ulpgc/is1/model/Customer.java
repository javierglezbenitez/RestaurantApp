package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {

    private String name;
    private String surname;
    private ArrayList<Order> orders;
    private List<Address> addresses;
    private Address address;

    public Customer(String name, String surname,String street, int number, int postalCode, String city) {
        this.name = name;
        this.surname = surname;
        this.address = new Address(street, number, postalCode, city);
        this.orders = new ArrayList<>();
    }


    public void addAddress(String street, int number, int postalCode, String city) {
        Address address = new Address(street, number, postalCode, city);
        this.addresses.add(address);
    }

    public void setAddress(String street, int number, int postalCode, String city) {
        this.address = new Address(street, number, postalCode, city);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    public List<Address> getAddressList() {
        return this.addresses;
    }

    public Address getAddress() {
        return this.address;
    }



    public Order getOrder(int number) {
        return (Order)this.orders.get(number);
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                '}';
    }
}

