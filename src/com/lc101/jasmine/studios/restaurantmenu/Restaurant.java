package com.lc101.jasmine.studios.restaurantmenu;

public class Restaurant {
    public static void main(String[] args) {
        Menu myMenu = new Menu("4-18-2022");
        MenuItem items = new MenuItem("pizza", 6.0, "lunch", true);
        System.out.println(items);
    }
}
