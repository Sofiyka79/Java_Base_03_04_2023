package ua.hillel.bondarenko.lessons.lesson14.Interfaces;


public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Iphone call");
    }

    @Override
    public void sms() {
        System.out.println("Iphone sms");
    }

    @Override
    public void internet() {
        System.out.println("Iphone internet");
    }
}
