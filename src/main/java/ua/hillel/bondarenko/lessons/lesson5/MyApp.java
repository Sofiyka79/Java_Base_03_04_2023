package ua.hillel.bondarenko.lessons.lesson5;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя первой команды");
        String nameCommand1 = sc.nextLine();
        System.out.println("Первая команда = " + nameCommand1);


        System.out.println("Введите количество фрагов " + nameCommand1 + " Игрок 1 ");
        int command1Player1 = sc.nextInt();
        System.out.println(nameCommand1 + " Игрок 1 количество фрагов = " + command1Player1);
        System.out.println("Введите количество фрагов " + nameCommand1 + " Игрок 2 ");
        int command1Player2 = sc.nextInt();
        System.out.println(nameCommand1 + " Игрок 2 количество фрагов = " + command1Player2);
        System.out.println("Введите количество фрагов " + nameCommand1 + " Игрок 3 ");
        int command1Player3 = sc.nextInt();
        System.out.println(nameCommand1 + " Игрок 3 количество фрагов = " + command1Player3);
        System.out.println("Введите количество фрагов " + nameCommand1 + " Игрок 4 ");
        int command1Player4 = sc.nextInt();
        System.out.println(nameCommand1 + " Игрок 4 количество фрагов = " + command1Player4);
        System.out.println("Введите количество фрагов " + nameCommand1 + " Игрок 5 ");
        int command1Player5 = sc.nextInt();
        System.out.println(nameCommand1 + " Игрок 5 количество фрагов = " + command1Player5);

        sc.nextLine();

        System.out.println("Введите имя второй команды");
        String nameCommand2 = sc.nextLine();
        System.out.println("Вторая команда = " + nameCommand2);

        System.out.println("Введите количество фрагов " + nameCommand2 + " Игрок 1 ");
        int command2Player1 = sc.nextInt();
        System.out.println(nameCommand2 + " Игрок 1 количество фрагов = " + command2Player1);
        System.out.println("Введите количество фрагов " + nameCommand2 + " Игрок 2 ");
        int command2Player2 = sc.nextInt();
        System.out.println(nameCommand2 + " Игрок 2 количество фрагов = " + command2Player2);
        System.out.println("Введите количество фрагов " + nameCommand2 + " Игрок 3 ");
        int command2Player3 = sc.nextInt();
        System.out.println(nameCommand2 + " Игрок 3 количество фрагов = " + command2Player3);
        System.out.println("Введите количество фрагов " + nameCommand2 + " Игрок 4 ");
        int command2Player4 = sc.nextInt();
        System.out.println(nameCommand2 + " Игрок 4 количество фрагов = " + command2Player4);
        System.out.println("Введите количество фрагов " + nameCommand2 + " Игрок 5 ");
        int command2Player5 = sc.nextInt();
        System.out.println(nameCommand2 + " Игрок 5 количество фрагов = " + command2Player5);
        sc.nextLine();

        double averageCommand1 = ((command1Player1 + command1Player2 + command1Player3 + command1Player4 + command1Player5) / 5);
        System.out.println("Средняя арифметическая команды " + nameCommand1 + " " + averageCommand1);
        double averageCommand2 = ((command2Player1 + command2Player2 + command2Player3 + command2Player4 + command2Player5) / 5);
        System.out.println("Средняя арифметическая команды " + nameCommand2 + " " + averageCommand2);

        String teamName;
        if (averageCommand1 > averageCommand2) {
            teamName = nameCommand1;
            int result = command1Player1 + command1Player2 + command1Player3 + command1Player4 + command1Player5;
            System.out.println("Победила команда" + teamName + " набрала " + result + " очків ");

        } else if (averageCommand1 < averageCommand2) {
            int result = command2Player1 + command2Player2 + command2Player3 + command2Player4 + command2Player5;
            teamName = nameCommand2;
            System.out.println("Победила команда" + teamName + " набрала " + result + " очків ");
        } else if (averageCommand1 == averageCommand2) {
            System.out.println("Ничья");

        }
    }
}
