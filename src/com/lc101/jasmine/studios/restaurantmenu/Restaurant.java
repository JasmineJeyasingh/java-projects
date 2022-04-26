package com.lc101.jasmine.studios.restaurantmenu;

public class Restaurant {
    public static void main(String[] args) {
        Menu myMenu = new Menu("4-18-2022");
        MenuItem items = new MenuItem("pizza", 6.0, "lunch", true);
        MenuItem items1 = new MenuItem("pizza", 6.0, "lunch", true);

        //System.out.println(items);
        myMenu.addItem(items);
        myMenu.addItem(items1);
//        myMenu.removeItem(items);
        myMenu.printMenu(3);
        System.out.println(items.equals(items));

    }
}
