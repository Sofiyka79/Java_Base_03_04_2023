package ua.hillel.bondarenko.lessons.lesson16;

public class Drinks {
    public static final int KAVA_PRICE = 80;
    public static final int TEA_PRICE = 40;
    public static final int LIMONADE_PRICE = 80;
    public static final int MOJITO_PRICE = 80;
    public static final int MINERAL_PRICE = 30;
    public static final int COCA_COLA_PRICE = 50;
    private  static  int sum = 0;
    private static int quantity = 0;

    public static void makeDrink(DrinksMachine drink) {
        switch (drink) {
            case KAVA:
                System.out.println("Кофе готовиться");
                break;
            case TEA:
                System.out.println("Чай готовиться");
                break;
            case LIMONADE:
                System.out.println("Лимонад готовиться");
                break;
            case MOJITO:
                System.out.println("Мохито готовиться");
                break;
            case MINERAL:
                System.out.println("Минеральна вода готовиться");
                break;
            case COCA_COLA:
                System.out.println("Coca Cola готовиться");
                break;
            default:
                System.out.println("Ошибка выбора");


        }
        quantity++;
    }

    public static void Sum(DrinksMachine drink) {
        switch (drink) {
            case KAVA:
                sum += KAVA_PRICE;
                break;
            case TEA:
                sum += TEA_PRICE;
                break;
            case LIMONADE:
                sum += LIMONADE_PRICE;
                break;
            case MOJITO:
                sum += MOJITO_PRICE;
                break;
            case MINERAL:
                sum += MINERAL_PRICE;
                break;
            case COCA_COLA:
                sum += COCA_COLA_PRICE;
                break;
        }
    }

    public static void displayTotal() {
        System.out.println("Кількисть віготовлених напоїв  " + quantity);
        System.out.println("Загальна сума, яку повинен заплатити клієнт: " + sum);
    }
}



