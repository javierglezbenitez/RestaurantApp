package org.ulpgc.is1.model;

public class Order {

    private int NEXT_ID = 0;

    private final int id;

    private OrderItem orderItem;

    public Order(OrderItem orderItem) {
        this.id = NEXT_ID++;
        this.orderItem = orderItem;
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

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(int quantity) {
        this.orderItem =  new OrderItem( quantity);
    }
}
