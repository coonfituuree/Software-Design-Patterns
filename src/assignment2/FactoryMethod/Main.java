package assignment2.FactoryMethod;

import assignment2.FactoryMethod.pizza.interfaces.IPizza;
import assignment2.FactoryMethod.restaurant.AktobePizzaRestaurant;
import assignment2.FactoryMethod.restaurant.AstanaPizzaRestaurant;
import assignment2.FactoryMethod.restaurant.PizzaRestaurant;

public class Main {
    public static void main(String[] args) {
        PizzaRestaurant astanaRestaurant = new AstanaPizzaRestaurant();
        PizzaRestaurant aktobeRestaurant = new AktobePizzaRestaurant();
        IPizza astanaPizza = astanaRestaurant.createPizza();
        IPizza aktobePizza = aktobeRestaurant.createPizza();
        astanaPizza.cook();
        aktobePizza.cook();
    }
}
