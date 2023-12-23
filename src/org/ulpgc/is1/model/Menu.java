package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private MenuType type;
    private ArrayList<Dish> dishes;

    public Menu(String name, MenuType type) {
        this.name = name;
        this.type = type;
        this.dishes = new ArrayList<>();
    }

    public void addDish(Dish dish){
        dishes.add(dish);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", type=" + type;
    }

    public List<Dish> getDishes() {return dishes;}

    public String getName() {
        return name;
    }

    public MenuType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(MenuType type) {
        this.type = type;
    }
}
