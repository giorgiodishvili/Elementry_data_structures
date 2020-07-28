package ge.george.designpattern.observer;

import java.security.PublicKey;
import java.util.ArrayList;

public class StockGrabber implements Subject{
    private ArrayList<Observer> observers;
    private double imbPrice;
    private double aaplPrice;
    private double googPrice;
    public StockGrabber(){
        observers = new ArrayList<>();

    }
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = observers.indexOf(o);
        System.out.println("Observer" + (observerIndex+1)+ " deleted");
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(imbPrice,aaplPrice,googPrice);
        }
    }

    public void setAAPLPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObservers();
    }

    public void setGOOGPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObservers();
    }

    public void setIBMPrice(double imbPrice) {
        this.imbPrice = imbPrice;
        notifyObservers();
    }
}
