package ua.hillel.bondarenko.lessons.lesson14.Interfaces;
//Зробіть інтерфейс Smartphones, який має містити методи call(), sms(), internet()
//Зробіть класи, які його імплементують: Androids, iPhones.
//Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати iOS
//Створіть екземпляри кожного виду у мейн-класі
public class Main {
    public static void main(String[] args) {
        IPhones iphones = new IPhones();
        iphones.call();
        iphones.sms();
        iphones.internet();

        Androids androids = new Androids();
        androids.call();
        androids.sms();
        androids.internet();

        androids.versionLinuxOS();
        iphones.versionIOS();




    }
}
