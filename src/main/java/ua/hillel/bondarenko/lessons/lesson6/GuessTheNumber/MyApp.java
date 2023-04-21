package ua.hillel.bondarenko.lessons.lesson6.GuessTheNumber;


import java.util.Scanner;

//Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
//
//Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).
public class MyApp {
    public static void main(String[] args) {


        int random = (int) (Math.random() * 11);
        System.out.println("random = " + random);
        System.out.println("Угадайте целое число от 0 до 10, которое загадал компьютер у Вас есть 3 попытки");


        for (int i = 1; i <= 4; i++) {

            if (i < 4) {

                System.out.println("Попытка " + i);

                Scanner scanner = new Scanner(System.in);
                System.out.println("Угадайте число от 0 до 10, которое загадал компьютер");

                while (true) {
                    if (scanner.hasNextInt()) {
                        int userValue = scanner.nextInt();
                        if (userValue == random) {
                            System.out.println("Вы угадали = " + userValue);
                            break;

                        }
                        break;

                    } else {
                            scanner.nextLine();
                            System.out.println("Введите пожалуйста число!");
                      }
                        //scanner.nextLine();

                }

            }

            if (i >= 3) {
                System.out.println("Low now guess");
                break;
            }

        }

    }
                }







