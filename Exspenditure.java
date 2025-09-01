package ru.netology;

public class Exspenditure extends Deal {
    String nameProduct;
    int priceProduct;

    public Exspenditure(String nameProduct, int priceProduct) {
        String comment = String.format("Покупка %s на %d руб.", nameProduct, priceProduct);
        super(comment, 0, priceProduct);
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        System.out.println(comment);
    }
}



