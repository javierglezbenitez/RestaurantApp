package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private Phone phone;


    private ArrayList<Order> orders;
    private ArrayList<Menu> menus;



    public  Restaurant(String name, Phone phone,Menu menu) {
        this.name = name;
        this.phone = phone;
        this.orders = new ArrayList<>();
        this.menus = new ArrayList<>();
        this.menus.add(menu);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Phone getPhone() {
        return this.phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Menu getMenu(int i) {
        return (Menu)this.menus.get(i);
    }

    public Order getOrder(int i) {
        return (Order)this.orders.get(i);
    }

    public void addMenu(Menu menu) {
        this.menus.add(menu);
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", phone=" + phone.getNumber() +
                ", menus=" + menus +
                '}';
    }
}
