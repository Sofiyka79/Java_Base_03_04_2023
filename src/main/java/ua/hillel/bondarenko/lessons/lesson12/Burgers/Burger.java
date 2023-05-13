package ua.hillel.bondarenko.lessons.lesson12.Burgers;

public class Burger {
    boolean meat;
    boolean bun;
    boolean mayo;
    boolean duoMeat;
    boolean cheese;
    boolean salad;

    public Burger(boolean meat, boolean bun, boolean cheese, boolean salad) {
        this.meat = meat;
        this.bun = bun;
        this.cheese = cheese;
        this.salad = salad;

        System.out.println("Дієтичний бургер (без майонезу) булочка, м'ясо, сир, зелень" );
    }

    public Burger(boolean meat, boolean bun, boolean mayo, boolean cheese, boolean salad) {
        this.meat = meat;
        this.bun = bun;
        this.mayo = mayo;
        this.cheese = cheese;
        this.salad = salad;

        System.out.println("Звичайний бургер (усі компоненти) булочка, м'ясо, сир, зелень, майонез");
    }

    public Burger(boolean meat, boolean bun, boolean mayo, boolean duoMeat, boolean cheese, boolean salad) {
        this.meat = meat;
        this.bun = bun;
        this.mayo = mayo;
        this.duoMeat = duoMeat;
        this.cheese = cheese;
        this.salad = salad;
        System.out.println("З подвійним м'ясом булочка, м'ясо, сир, зелень, майонез");
    }



}

