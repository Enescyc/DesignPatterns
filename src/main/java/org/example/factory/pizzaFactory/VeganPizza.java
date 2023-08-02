package org.example.factory;

public class VeganPizza implements IPizza {
    @Override
    public void prepare() {
        System.out.println("prepare vegan pizza");
    }

    @Override
    public void bake() {
        System.out.println("bake vegan pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut vegan pizza");
    }
}
