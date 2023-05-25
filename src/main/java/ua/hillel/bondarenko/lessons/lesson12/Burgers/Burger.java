package ua.hillel.bondarenko.lessons.lesson12.Burgers;

public class Burger {
    String meat;
    String bun;
    boolean mayo;
    boolean duoMeat;
    String cheese;
    String salad;

    public Burger(String meat, String bun, String cheese, String  salad) {
        this.meat = meat;
        this.bun = bun;
        this.cheese = cheese;
        this.salad = salad;

        System.out.println("Дієтичний бургер (без майонезу) булочка, м'ясо, сир, зелень" );
    }

    public Burger( String meat, String bun, Boolean mayo, String cheese, String salad) {
        this.meat = meat;
        this.bun = bun;
        this.mayo = mayo;
        this.cheese = cheese;
        this.salad = salad;

        System.out.println("Звичайний бургер (усі компоненти) булочка, м'ясо, сир, зелень, майонез");
    }

    public Burger(String meat, String bun, boolean mayo, boolean duoMeat, String cheese, String salad) {
        this.meat = meat;
        this.bun = bun;
        this.mayo = mayo;
        this.duoMeat = duoMeat;
        this.cheese = cheese;
        this.salad = salad;
        System.out.println("З подвійним м'ясом булочка, м'ясо, сир, зелень, майонез");
    }



}

