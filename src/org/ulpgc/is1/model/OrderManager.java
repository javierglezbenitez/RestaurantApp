package org.ulpgc.is1.model;

import org.ulpgc.is1.model.*;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private  List<Customer> customerList = new ArrayList();
    private  List<Restaurant> restaurantList = new ArrayList();
    private  List<Dish> dishList = new ArrayList();

    public OrderManager() {
    }
    public List<Customer> getCustomerList() {
        return this.customerList;
    }

    public void addCustomer(String name, String surname, String street, int number, int postalCode, String city) {
        Customer customer = new Customer(name, surname, street, number, postalCode, city);
        if (!this.customerList.contains(customer)) {
            this.customerList.add(customer);
        }

    }

    public Customer getCustomer(int i) {
        return (Customer)this.customerList.get(i);
    }

    public void addRestaurant(String name, Phone phone, Menu menu) {
        Restaurant restaurant = new Restaurant(name, phone, menu);
        if (!this.restaurantList.contains(restaurant)) {
            this.restaurantList.add(restaurant);
        }

    }

    public Restaurant getRestaurant(int i) {
        return (Restaurant)this.restaurantList.get(i);
    }

    public void addDish(String name, String description, int price) {
        Dish dish = new Dish(name, description, price);
        if (!this.dishList.contains(dish)) {
            this.dishList.add(dish);
        }

    }

    public int getDishesNumber() {
        return this.dishList.size();
    }

    public Dish getDish(int i) {
        return (Dish)this.dishList.get(i);
    }

    public void removeCustomer(int i) {
        this.customerList.remove(i);
    }

    public void order(Customer customer, Restaurant restaurant, int[] dishes, int[] quantities) {
        Order order = new Order(customer, restaurant);

        for(int i = 0; i < dishes.length; ++i) {
            order.addItems(quantities[i], this.getDish(dishes[i]));
        }

        customer.addOrder(order);
        restaurant.addOrder(order);
    }
}
