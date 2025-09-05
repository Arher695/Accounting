package ru.netology;

import taxes.ComplexTaxDebitMinusCredit;
import taxes.SimpleTaxDebit;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Defense", new ComplexTaxDebitMinusCredit());

        company1.setTaxSystem(new SimpleTaxDebit());

        company1.applyDeals(new Deal[]{
                new Sale("Шлемофон", 3000),
                new Exspenditure("Гарнитура", 2000)
        });

        company1.shiftMoney(5000);
        company1.shiftMoney(-2000);

        company1.payTaxes();

    }
}
