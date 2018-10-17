package designpatterns;

import designpatterns.observer.Observer;

import java.util.ArrayList;

public class Data {

    private String message;
    private ArrayList<Observer> observers;

    public Data(){
        observers = new ArrayList<>();
    }
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObserver(){
        for (int i=0; i< observers.size();i++){
            Observer observer= (Observer) observers.get(i);
            observer.update(message);
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
