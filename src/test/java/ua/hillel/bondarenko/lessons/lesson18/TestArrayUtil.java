package ua.hillel.bondarenko.lessons.lesson18;

import static ua.hillel.bondarenko.lessons.lesson18.unitTesting.Methods.matrixSquare;

public class TestArrayUtil {
   //@Test
    void testMethod1(){
    int[][] matrix1 = {

            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    boolean isSquare = matrixSquare(matrix1);
    System.out.println("Квадратная матрица: " + isSquare);


}


    }



