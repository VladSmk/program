package com.company;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Product p1 = new Product();
        p1.parsing(
                "~~~La-ua-Vinnytsya",
                "https://la.ua/vinnytsya/",
                "col-md-6 col-lg-4",
                "productTitle h5",
                "",
                "productPrice",
                ""
        );

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

        Product p3 = new Product();
        p3.parsing(
                "~~~sushiwok",
                "https://sushiwok.ua/vin/menu/sety/",
                "card-wrapper--grid  ",
                "card__name js-content",
                "",
                "itemtype",
                "https://schema.org/priceCurrency"
        );

    }
}

