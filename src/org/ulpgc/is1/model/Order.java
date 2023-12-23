package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Iterator;

public class Order {

    private static int NEXT_ID = 0;

    public final int id;

    private ArrayList<OrderItem> orderItems;

    private Customer customer;
    private Restaurant restaurant;




    public Order(Customer customer, Restaurant restaurant) {
        this.id = NEXT_ID++;
        this.orderItems = new ArrayList<>();
        this.customer = customer;
        this.restaurant = restaurant;

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public int getNEXT_ID() {
        return NEXT_ID;
    }

    public void setNEXT_ID(int NEXT_ID) {
        this.NEXT_ID = NEXT_ID;
    }

    public int getId() {
        return id;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }




    void addItems(int quantity,Dish dish){
        OrderItem item = new OrderItem(quantity, dish);
        orderItems.add(item);
    }

    void delItems(int index){
        orderItems.remove(index);
    }


    public int price() {
        int price = 0;

        OrderItem item;
        for(Iterator var2 = this.orderItems.iterator(); var2.hasNext(); price += item.getDish().getPrice() * item.getQuantity()) {
            item = (OrderItem)var2.next();
        }

        return price;
    }
    @Override
    public String toString() {
        return
                "id=" + id +
                 ", orderItems=" + orderItems.toString() ;
    }

}
