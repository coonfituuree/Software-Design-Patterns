package assignment2.FactoryMethod.restaurant;

import assignment2.FactoryMethod.pizza.AktobePizza;
import assignment2.FactoryMethod.pizza.interfaces.IPizza;

public class AktobePizzaRestaurant extends PizzaRestaurant {
    @Override
    public IPizza createPizza() {
        return new AktobePizza();
    }
}

