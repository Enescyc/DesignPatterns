package org.example.factory;

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
