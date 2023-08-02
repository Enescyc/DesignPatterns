package org.example.decorator;

public class MockDeleteRepository<T> extends MockSaveAndUpdateRepository<T> {
    public boolean delete(){
        System.out.println("Object deleted");
        return true;
    };
}
