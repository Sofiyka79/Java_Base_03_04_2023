package ua.hillel.bondarenko.lessons.lesson18.unitTesting;

import java.util.Arrays;

public class Methods {

    public static double average(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static boolean matrixSquare(int[][] matrix) {

        if (matrix == null) {
            return false;
        }


        int rows = matrix.length;
        int cols = matrix[0].length;



        if (rows != cols) {
            return false;
        }
        for (int i = 0; i < rows; i++) {
            if (matrix[i].length != cols) {
                return false;
            }
        }
        return true;
    }





}
