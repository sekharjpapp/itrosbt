package designpatterns.observer;

import designpatterns.Data;

public class ObserverPattern {
    public static void main(String[] args) {
        Data data = new Data();

        Observer std = new Student(data);
        String msg= "Hello World";
        data.setMessage(msg);

        if (!data.getMessage().equals("")){
            data.notifyObserver();
        }
    }
}
