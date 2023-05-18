package ua.hillel.bondarenko.lessons.lesson12.getterSetters;

public class FitnessUser {
    private  String name;
    private String surname;
    private int birthdayDay;
    private int birthdayMounth;
    private int birthdayYear;
    private String number;
    private String email;
    private Integer age;
    private Integer weight;
    private String pressure;
    private Integer steps;

    public FitnessUser(String name, String surname, int birthdayDay, int birthdayMounth, int birthdayYear, String number, String email, Integer weight, String pressure, Integer steps) {
        this.name = name;
        this.surname = surname;
        this.birthdayDay = birthdayDay;
        this.birthdayMounth = birthdayMounth;
        this.birthdayYear = birthdayYear;
        this.age = 2023 - birthdayYear;
        this.number = number;
        this.email = email;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;

    }


    public String getName() {
        return name;
    }

    public int getBirthdayDay() {
        return birthdayDay;
    }

    public int getBirthdayMounth() {
        return birthdayMounth;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }



    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }
    public void printAccountInfo(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Birthday: " + birthdayDay + birthdayMounth + birthdayYear + " Age " + age);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + number);
        System.out.println("Weight: " + weight);
        System.out.println("Pressure: " + pressure);
        System.out.println("Steps: " + steps);
    }

}
