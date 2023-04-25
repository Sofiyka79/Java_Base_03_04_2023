package ua.hillel.bondarenko.lessons.lesson7.Regbi;

import java.util.Arrays;

//Є дві команди регбі з 25 гравців різного віку у кожній.
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//        Виведіть у двох рядках вік гравців кожної команди.
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.
public class Main {
    public static void main(String[] args) {

        int[] team = new int[50];

        int[] command1 = new int[team.length / 2];
        int[] command2 = new int[team.length / 2];

        int iterator1 = 0;
        int iterator2 = 0;

        int sumTeam1 = 0;
        int sumTeam2 = 0;

        int avgTeam1 = 0;
        int avgTeam2 = 0;


        for (int i = 0; i < team.length; i++) {
            team[i] = (int) ((Math.random() * (40-18+1)) + 18);
            if (i % 2 == 0) {
                command1[iterator1] = team[i];
                sumTeam1 += team[i];
                    iterator1++;


            } else {
                command2[iterator2] = team[i];
                sumTeam2 += team[i];
                iterator2++;
                            }
        }
        System.out.println(Arrays.toString(team));
        System.out.println(Arrays.toString((command1)));
        System.out.println(Arrays.toString((command2)));

        System.out.println("sumTeam1" + sumTeam1);
        System.out.println("sumTeam2" + sumTeam2);


        avgTeam1 = sumTeam1/command1.length;
        avgTeam2 = sumTeam1/command2.length;



        if (avgTeam1 > avgTeam2) {
            System.out.println("TEAM 1 Старше");
        }  if (avgTeam1 < avgTeam2) {
            System.out.println("TEAM 2 Старше");
        } else {
            System.out.println("Возраст одинаковый");
        }
    }
}

