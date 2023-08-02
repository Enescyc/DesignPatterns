package org.example.decorator;

public class MockJpaRepository<T> {

    public T save(T t) {
        System.out.println("Saved");
        return t;
    }

    public T update(T t) {
        System.out.println("Updated");
        return t;
    }

}
