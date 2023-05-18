package ua.hillel.bondarenko.lessons.lesson12.getterSetters;

//Зробіть програму для фітнес трекера, яка реєструватиме нового
// користувача створюючи йому обліковий запис, приймаючи
// наступні параметри:
//Незмінні (задаються тільки при створенні облікового запису,
// і можуть бути отримані лише за допомогою гетерів):
//Ім'я
//Дата народження (окремо день, місяць, рік)
//Емейл
//Телефон
//Змінювані:
//Прізвище
//Вага
//Тиск
//Кількість пройдених за день кроків

//Створювати кожного користувача необхідно через конструктор,
// беручи всі поля на вхід конструктора.
//Додати метод printAccountInfo(), при виклику якого
// друкувати всі дані про користувача
//Після прийому року народження - вираховувати вік користувача у
// внутрішню змінну age (відштовхуючись просто від 2020 року,
// ускладнювати тут не будемо), на яку зробити тільки геттер і
// виводити на екран разом з іншими полями в методі printAccountInfo();
// у конструкторі або геттерах/сеттерах не використовуємо
// виведення в консоль.
//У main-класі створити 3-5 користувачів та роздрукувати дані
// кожного через виклик методу printAccountInfo();
// для двох
// користувачів змінити кілька полів та роздрукувати нові дані повторно
public class Main {
    public static void main(String[] args) {
        FitnessUser fitnessUser1 = new FitnessUser("Sofia","Bondarenko",12,11,1992,"+380967407817", "Sofiykapn@gmail.com",55,"110/60", 10000 );
        FitnessUser fitnessUser2 = new FitnessUser("Sofia2","Bondarenko2",12,11,1995,"+380967407818", "Sofiykapn2@gmail.com",55,"110/60", 10000 );
        FitnessUser fitnessUser3 = new FitnessUser("Sofia3","Bondarenko3",12,11,1997,"+380967407819", "Sofiykapn3@gmail.com",55,"110/60", 10000 );

    fitnessUser1.printAccountInfo();
    fitnessUser2.printAccountInfo();
    fitnessUser3.printAccountInfo();


    fitnessUser2.setPressure("115/55");
    fitnessUser2.setSurname("Bondarencko");
    fitnessUser2.setSteps(15000);
    fitnessUser2.setWeight(52);

    fitnessUser3.setPressure("90/55");
    fitnessUser3.setSurname("Ponomarenko");
    fitnessUser3.setSteps(12000);
    fitnessUser3.setWeight(56);

    fitnessUser2.printAccountInfo();
    fitnessUser3.printAccountInfo();


    }
}
