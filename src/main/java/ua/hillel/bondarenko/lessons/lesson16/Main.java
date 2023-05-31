package ua.hillel.bondarenko.lessons.lesson16;

import java.util.Scanner;

//Інструменти для використання:
//1) enum (напої)
//2) константи (ціни)
//3) static (загальна вартість)
//4) switch (вибір напою)
//
//Завдання:
//
//#1 зробіть enum DrinksMachine, який вміє робити КАВУ, ЧАЙ, ЛИМОНАД, МОХІТО, МИНЕРАЛКУ, КОКА_КОЛУ;
//#2 Зробіть клас Drinks, де константами задайте ціну напою;
//#3 Зробіть підрахунок кількості виготовлених напоїв та загальної суми, яку повинен заплатити клієнт;
//#4 Зробіть спосіб приготування кожного напою;
//#5 Зробіть switch-case оператор, який буде робити напій (викликаючи відповідний метод) в залежності від вибору клієнта;
//#6 Додайте можливість вибору напою для користувача і залежно від вибору робіть йому напій;
//#7 Користувач повинен мати можливість замовити кілька напоїв
//#8 І насамкінець клієнт має побачити, скільки грошей він повинен заплатити;
public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Вибиріть напій:");
                System.out.println("1. Кава");
                System.out.println("2. Чай");
                System.out.println("3. Лимонад");
                System.out.println("4. Мохито");
                System.out.println("5. Минеральна вода");
                System.out.println("6. Coca Cola");
                System.out.println("7. Закончить выбор");
                System.out.println("Сделайте свой выбор: ");

                int change = 0;


                while (true) {
                    if (scanner.hasNextInt()) {
                        change = scanner.nextInt();
                        break;
                    } else {
                        scanner.nextLine();
                        System.out.println("Введите пожалуйста число!");
                    }
                }




                DrinksMachine drink;
                switch (change) {
                    case 1:
                        drink = DrinksMachine.KAVA;
                        break;
                    case 2:
                        drink = DrinksMachine.TEA;
                        break;
                    case 3:
                        drink = DrinksMachine.LIMONADE;
                        break;
                    case 4:
                        drink = DrinksMachine.MOJITO;
                        break;
                    case 5:
                        drink = DrinksMachine.MINERAL;
                        break;
                    case 6:
                        drink = DrinksMachine.COCA_COLA;
                        break;
                    case 7:
                        Drinks.displayTotal();
                        return;
                    default:
                        System.out.println("Неправильный выбор повторите из списка");
                        continue;

                }
               Drinks.makeDrink(drink);
                Drinks.Sum(drink);
            }
        }





}

