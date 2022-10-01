package com.company;

import java.io.IOException;

public class Pizza{
    void express_pizza() throws IOException {
        Product p2 = new Product();
        p2.parsing(
                "~~~Express-pizza",
                "https://express-pizza.vn.ua/catalog/pitstsa/",
                "col-lg-3 col-xl-3 col-sm-6 product-ajax-cont ",
                "itemprop",
                "name",
                "itemprop",
                "price"
        );
    }
    void la_ua_pizza() throws IOException {
        Product p2 = new Product();
        p2.parsing(
                "~~~Express-pizza",
                "https://express-pizza.vn.ua/catalog/pitstsa/",
                "col-lg-3 col-xl-3 col-sm-6 product-ajax-cont ",
                "itemprop",
                "name",
                "itemprop",
                "price"
        );
    }
}
