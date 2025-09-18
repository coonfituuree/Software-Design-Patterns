package assignment2.AbstractFactory.factory;

import assignment2.AbstractFactory.product.american.Cheesecake;
import assignment2.AbstractFactory.product.american.Cola;
import assignment2.AbstractFactory.product.american.NewYorkPizza;
import assignment2.AbstractFactory.product.interfaces.IDessert;
import assignment2.AbstractFactory.product.interfaces.IDrink;
import assignment2.AbstractFactory.product.interfaces.IPizza;


public class AmericanRestaurant implements IRestaurant {
    public IPizza createPizza(){
        return new NewYorkPizza();
    }

    public IDrink createDrink(){
        return new Cola();
    }

    public IDessert createDessert(){
        return new Cheesecake();
    }
}
