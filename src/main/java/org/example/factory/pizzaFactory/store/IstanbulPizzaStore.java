package org.example.factory.pizzaFactory.store;

import org.example.factory.pizzaFactory.CheesePizza;
import org.example.factory.pizzaFactory.IPizza;
import org.example.factory.pizzaFactory.MixedPizza;

public class IstanbulPizzaStore extends AbstractPizzaStore {
    @Override
    protected IPizza createPizza(String type) throws IllegalArgumentException {
        switch (type) {
            case "cheese":
                return new CheesePizza();
            case "mixed":
                return new MixedPizza();
        }
        throw new IllegalArgumentException("Invalid pizza type for Istanbul Pizza Store");
    }
}
