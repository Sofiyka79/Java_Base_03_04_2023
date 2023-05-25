package ua.hillel.bondarenko.lessons.lesson14.Interfaces;

public class Androids implements Smartphones, LinuxOS{
    @Override
    public void call() {
        System.out.println("Android call");
    }

    @Override
    public void sms() {
        System.out.println("Android Sms");
    }

    @Override
    public void internet() {
        System.out.println("Android internet");
    }

    @Override
    public void versionLinuxOS() {
        System.out.println("Version LinuxOS");
    }
}
