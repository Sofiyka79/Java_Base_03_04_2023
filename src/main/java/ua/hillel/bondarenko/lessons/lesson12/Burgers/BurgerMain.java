package ua.hillel.bondarenko.lessons.lesson12.Burgers;

//Зробити клас Burger, який матиме поля:
//булочка, м'ясо, сир, зелень, майонез
//Зробити три конструктори, які дозволятимуть
// робити бургери трьох видів:
//звичайний бургер (усі компоненти)
//дієтичний бургер (без майонезу)
//з подвійним м'ясом
//У кожен конструктор додати виведення в консоль
// складу даного варіанту бургера (при створенні
// екземпляра бургера, який використовує даний
// конструктор - буде виводитися в консоль його склад).
//Зробити клас BurgerMain, в якому створити три різні
// бургери. Їхній склад буде автоматично виводитися на
// екран під час запуску програми.
public class BurgerMain {

    public static void main(String[] args) {


    Burger diet = new Burger("Meat","Bun","Cheese", "Salad");

    Burger ordinary = new Burger("Meat","Bun",true,"Cheese","Salad");
    Burger duoMeat = new Burger("Meat","Bun",true,true,"Cheese", "Salad");
    }
}
