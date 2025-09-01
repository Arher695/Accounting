package ru.netology;

public class Sale extends Deal {
    String nameProduct;
    int priceProduct;

    public Sale(String nameProduct, int priceProduct) {
        String comment = String.format("Продажа %s на %d руб.", nameProduct, priceProduct);
        super(comment, priceProduct, 0);
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        System.out.println(comment);
    }
}

