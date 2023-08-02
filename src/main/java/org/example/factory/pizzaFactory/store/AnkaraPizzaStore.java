package org.example.factory.pizzaFactory.store;

import org.example.factory.pizzaFactory.CheesePizza;
import org.example.factory.pizzaFactory.IPizza;
import org.example.factory.pizzaFactory.VeganPizza;

public class AnkaraPizzaStore extends AbstractPizzaStore {

    @Override
    protected IPizza createPizza(String type) throws IllegalArgumentException {
        switch (type) {
            case "cheese":
                return new CheesePizza();
            case "vegan":
                return new VeganPizza();
        }
        throw new IllegalArgumentException("Invalid Pizza Type for Ankara Pizza Store");
    }
}
