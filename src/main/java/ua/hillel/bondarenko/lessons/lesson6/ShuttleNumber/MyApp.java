package ua.hillel.bondarenko.lessons.lesson6.ShuttleNumber;
//У Японії числа 4 та 9 вважаються нещасливими.
// Вам потрібно пронумерувати 100 космічних шатлів для
// перевезення людей на Марс так, щоб у номерах шатлів не
// траплялося нещасливих чисел. Напишіть функцію, яка
// виводить усі номери таких шатлів.
public class MyApp {
    public static void main(String[] args) {
        int sum=100;
        int hundred;

        for (int i = 1; i <= sum; i++) {
            if ((i == 4 || i==9 || i/10 ==4 || i/10 == 9 || (i%10==9) || i%10==4 || (i/100)==4 || ((i/100)==9 )||(i%100)==4 || ((i%100)==9))) {
                sum = sum+1;
                continue;


        }
            System.out.println(i);


        }


    }
}
