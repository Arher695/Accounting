package ru.netology;

public class Sale extends Deal {
    public Sale(String nameProduct, int priceProduct) {
        super(String.format("Продажа %s на %d руб.", nameProduct, priceProduct),
                priceProduct,
                0);


    }
}
