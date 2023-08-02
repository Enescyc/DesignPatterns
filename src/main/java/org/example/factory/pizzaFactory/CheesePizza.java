package org.example.factory;

public class CheesePizza implements IPizza {
    @Override
    public void prepare() {
        System.out.println("Preparing cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut cheese pizza");
    }
}
