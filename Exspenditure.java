package ru.netology;

public class Exspenditure extends Deal {
    public Exspenditure(String nameProduct, int priceProduct) {
        super(String.format("Покупка %s на %d руб.", nameProduct, priceProduct),
                0,
                priceProduct);

    }
}



