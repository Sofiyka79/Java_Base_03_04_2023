package ua.hillel.bondarenko.lessons.lesson9.homeWork.TranspMatric;
//Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
// Після введення повинні автоматично створюватися
// два масиви розміром M x N перший та N x M другий.
public class MyApp {
    public static void main(String[] args) {
        int n=7;
        int m=5;

        int [][] matrix1 = new int [n][m];
        for (int i=0; i< matrix1.length; i++){
            for (int j=0;j < matrix1.length; j++){
                System.out.println(matrix1[i][j]+"\t");
            }
        }
    }
}
