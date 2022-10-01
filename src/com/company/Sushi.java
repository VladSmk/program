package com.company;

import java.io.IOException;

public class Sushi {
    void wok_sushi() throws IOException {
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
