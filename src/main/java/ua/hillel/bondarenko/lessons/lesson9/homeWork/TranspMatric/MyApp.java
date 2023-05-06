package ua.hillel.bondarenko.lessons.lesson9.homeWork.TranspMatric;

import java.util.Scanner;

//Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
// Після введення повинні автоматично створюватися
// два масиви розміром M x N перший та N x M другий.


public class MyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите N ");
        int n = sc.nextInt();
        System.out.println("Введите M ");
        int m = sc.nextInt();

        if ((n % 1 == 0)&&(m % 1 == 0)&&(n>0)&&(m>0)) {
            System.out.println("Число является целым.");


        int [][] matrix1 = new int [n][m];

        for (int i=0; i< matrix1.length; i++){
            for (int j=0;j < matrix1[i].length; j++){
                matrix1[i][j]= (int) (Math.random()*101);
                System.out.print(matrix1[i][j]+ "\t");

            }
            System.out.println();
        }

        System.out.println();


        int [][] matrix2 = new int [n][m];

        for (int i=0; i< matrix2.length; i++){
            for (int j=0;j < matrix2[i].length; j++){
               int temp = matrix1[i][j];
               matrix2[i][j]=matrix1[j][i];
               matrix2[j][i]=temp;
                System.out.print(matrix2[i][j]+ "\t");

            }
            System.out.println();
        }

        } else {
            System.out.println("Число не является целым или меньше нуля");
        }
    }
}
