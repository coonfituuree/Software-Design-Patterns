package assignment2.FactoryMethod.restaurant;

import assignment2.FactoryMethod.pizza.AstanaPizza;
import assignment2.FactoryMethod.pizza.interfaces.IPizza;

public class AstanaPizzaRestaurant extends PizzaRestaurant {
    @Override
    public IPizza createPizza() {
        return new AstanaPizza();
    }
}
