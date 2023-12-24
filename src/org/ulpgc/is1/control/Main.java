package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

public class Main {
    private static void init(OrderManager orderManager) {
        orderManager.addCustomer("Carlos", "González", "Calle Principal", 25, 35250, "Ciudad Real");
        orderManager.addCustomer("María", "López", "Avenida Central", 35, 35218, "Madrid");
        orderManager.addRestaurant("El Rincón del Sabor", new Phone("987654621"), new Menu("Menú diario", MenuType.Daily));
        orderManager.addRestaurant("La Parrilla", new Phone("567890123"), new Menu("Menú infantil", MenuType.Kids));
        orderManager.addDish("Cordero al Horno", "Delicioso cordero asado con guarnición de patatas y zanahorias.", 12);
        orderManager.addDish("Tiramisú", "Capas de bizcocho mojado en café, crema de mascarpone y cacao en polvo.", 5);
        orderManager.addDish("Ensalada Mediterránea", "Mezcla fresca de tomate, pepino, olivas y queso feta.", 8);
    }

    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        init(orderManager);
        System.out.println("------------Datos del primer restaurante------------");
        System.out.println(orderManager.getRestaurant(0).toString());
        System.out.println("-------------Datos del segundo cliente--------------");
        System.out.println(orderManager.getCustomer(1).toString());
        System.out.println("--------------Datos del tercer plato----------------");
        System.out.println(orderManager.getDish(2).toString());
        orderManager.removeCustomer(1);
        System.out.println("--------------------------Imprimir por pantalla el número de clientes-------------------------");
        System.out.println("Nº de clientes: " + orderManager.getCustomerList().size());
        System.out.println("-----------------------Imprimir primer pedido----------------------------");
        System.out.println(orderManager.getDishesNumber() - 1);
        orderManager.order(orderManager.getCustomer(0), orderManager.getRestaurant(0), new int[]{orderManager.getDishesNumber() - 1, orderManager.getDishesNumber() - 2}, new int[]{2, 3});
        System.out.println(orderManager.getRestaurant(0).getOrder(0).toString());
        System.out.println("Total price = " + orderManager.getRestaurant(0).getOrder(0).price() + "€");
    }

}