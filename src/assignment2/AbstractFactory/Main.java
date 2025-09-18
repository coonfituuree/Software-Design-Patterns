package assignment2.AbstractFactory;

import assignment2.AbstractFactory.factory.AmericanRestaurant;
import assignment2.AbstractFactory.factory.IRestaurant;
import assignment2.AbstractFactory.factory.ItalianRestaurant;
import assignment2.AbstractFactory.product.interfaces.IDessert;
import assignment2.AbstractFactory.product.interfaces.IDrink;
import assignment2.AbstractFactory.product.interfaces.IPizza;
import assignment2.AbstractFactory.product.italian.ItalianPizza;

public class Main {
    public static void main(String[] args) {
        IRestaurant italianRestaurant = new ItalianRestaurant();
        IRestaurant americanRestaurant = new AmericanRestaurant();

        IPizza italianPizza = new ItalianRestaurant().createPizza();
        IDrink italianWine = new ItalianRestaurant().createDrink();
        IDessert tiramisu = new ItalianRestaurant().createDessert();

        italianPizza.cook();
        italianWine.pour();
        tiramisu.serve();

        System.out.println("=====================================================================");
        IPizza americanPizza = new AmericanRestaurant().createPizza();
        IDrink americanCola = new AmericanRestaurant().createDrink();
        IDessert americanCheesecake = new AmericanRestaurant().createDessert();

        americanPizza.cook();
        americanCola.pour();
        americanCheesecake.serve();
    }
}
