package cz.uhk.pro2;

import cz.uhk.pro2.models.PizzaMenu;
import cz.uhk.pro2.models.PizzaMenuItem;

public class Main {

    public static void main(String[] args) {
        // write your code here
        PizzaMenu menu = new PizzaMenu();
        menu.addItem(new PizzaMenuItem("Slaninova", "Pizza se slaninou", 160));
        menu.addItem(new PizzaMenuItem("Zampionova", "Pizza s zampiony", 150));
        System.out.println("last update: " + menu.getLastUpdate());

        for (PizzaMenuItem item : menu.getItems()) {
            System.out.println(item.getName());
        }

    }
}
