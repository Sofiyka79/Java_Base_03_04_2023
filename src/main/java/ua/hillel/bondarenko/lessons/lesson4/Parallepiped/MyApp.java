package ua.hillel.bondarenko.lessons.lesson4.Parallepiped;

public class MyApp {
    public static void main(String[] args) {
        int PowerLi;
        int LiWarrior = 13;
        int Liarcher = 24;
        int LiRider = 46;
        double PowerMin;
        int MinWarrior = 9;
        int Minarcher = 35;
        int MinRider = 12;
        int NumberOfWarriorsLi = 860;
        double NumberOfWarriorsMin = 860 * 1.5;

        PowerLi = ((LiWarrior*NumberOfWarriorsLi)+(Liarcher*NumberOfWarriorsLi)+(LiRider*NumberOfWarriorsLi));
        PowerMin =((MinWarrior*NumberOfWarriorsMin)+(Minarcher*NumberOfWarriorsMin)+(MinRider*NumberOfWarriorsMin));

        System.out.println("Загальна атака Лі = "+ PowerLi);
        System.out.println("Загальна атака Мінь = "+ PowerMin);


    }
}
