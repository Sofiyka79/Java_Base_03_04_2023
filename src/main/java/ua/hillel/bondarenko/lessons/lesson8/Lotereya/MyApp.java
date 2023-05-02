package ua.hillel.bondarenko.lessons.lesson8.Lotereya;

import java.util.Arrays;

//Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
//
//Перший масив - це числа, які загадані фірмою-організатором лотереї.
//
//Другий масив - це числа, які вгадав гравець.
//
//Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
//
//У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом; Наприклад:
//first[3] повинен дорівнювати second[3], як показано нижче.
//
//Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
//
//[0, 1, 4, 5, 5, 8, 9]
//[1, 1, 2, 3, 5, 6, 9]
//
//Кількість збігів: 3
public class MyApp {
    public static void main(String[] args) {

        int [] array1 = {8, 9, 1, 2, 0, 8, 5};
        System.out.println("Задуманный массив компанией" );
        System.out.println(Arrays.toString(array1));

        int counter = 0 ;

        for (int i=0; i < array1.length - 1; i++){
            for (int j = 0; j < array1.length -1 - i; j++){
                counter++;
                if ( array1[j]> array1[j+1]){
                    int temp = array1[j];
                    array1[j]= array1[j+1];
                    array1[j+1] = temp;

                }
            }
        }

        System.out.println("counter = " + counter);
        System.out.println("Отсортированный массив задуманный компанией" );
        System.out.println(Arrays.toString(array1));






        int[] array2;
        array2 = new int[7];
        for (int i = 0; i < array2.length; i++) {

            array2[i] = ((int)(Math.random() * 10));

        }
        System.out.println("Рандомный массив");
        System.out.println(Arrays.toString(array2));

        Arrays.sort(array2);
        System.out.println("Отсортированный рандомный массив");
        System.out.println(Arrays.toString(array2));


        System.out.println("Отсортированный массив задуманный компанией" );
        System.out.println(Arrays.toString(array1));
        System.out.println("Отсортированный рандомный массив");
        System.out.println(Arrays.toString(array2));

        int[] win = new int[array1.length];
        int index = 0;
        int count = 0;

        for (int i = 0; i < array1.length ; i++) {

            if(array1[i] == array2[i]) {
                win[index] = array1[i];
                count++;
                System.out.println(" индекс "+ i);
                System.out.println("C значением "+ win[index]);
            }
        }

        System.out.println("Количество совпадений = "+ count);

    }
}
