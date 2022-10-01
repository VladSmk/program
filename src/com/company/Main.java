package com.company;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Pizza pizza = new Pizza();
        pizza.express_pizza();
        pizza.la_ua_pizza();
        pizza.prontop_pizza();

        Sushi sushi = new Sushi();
        sushi.wok_sushi();
        //sushi.yama_sushi();
    }
}

