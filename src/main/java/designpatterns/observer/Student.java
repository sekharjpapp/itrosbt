package designpatterns.observer;

import designpatterns.Data;

public class Student implements Observer{

    private String message;
    public Student(Data data){
        data.registerObserver(this);
    }

    @Override
    public void update(String message) {
        this.message= message;
        display();
    }

    @Override
    public void display() {
        System.out.println(this.message);
    }
}
