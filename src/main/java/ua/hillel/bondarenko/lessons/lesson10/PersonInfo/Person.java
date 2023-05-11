package ua.hillel.bondarenko.lessons.lesson10.PersonInfo;

import java.sql.SQLOutput;

// Зробити клас Person та в ньому метод personInfo()
//На вхід передавати йому чотири параметри: ім'я, прізвище, місто, телефон
//Всередині методу формувати рядок у форматі:
//Зателефонувати громадянину + ІМ'Я ПРІЗВИЩЕ + із міста + МІСТО можна за номером + ТЕЛЕФОН
//Метод має повертати String
//У main-методі зробити три виклики методу personInfo, щоразу передаючи нову людину;
//Повинен вийти висновок такого типу:
//Зателефонувати громадянинові Will Smith з міста New York можна за номером 2936729462846.
//Зателефонувати громадянинові Jackie Chan з міста Shanghai можна за номером 12312412412.
//Зателефонувати до громадян Sherlock Holmes з міста London можна за номером 37742123513.
public class Person {
     static String PersonInfo(String name, String surname, String city, Integer Number) {

         System.out.println("Зателефонувати громадянину" + +"ІМ'Я ПРІЗВИЩЕ"+name + "із міста" + "МІСТО можна за номером" + city + "ТЕЛЕФОН"+ Number);
         String info;
         return info;
    }
}
