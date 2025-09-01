package ru.netology;

import taxes.ComplexTaxDebitMinusCredit;
import taxes.SimpleTaxDebit;

public class Main {
    public static void main(String[] args) {
        Deal[] deals = {
                new Sale("шлемофон", 3000),
                new Exspenditure("гарнитура", 2000),
                new Sale("балаклава", 200),
                new Exspenditure("перчатки", 400)};
        Company company1 = new Company("Defense", new ComplexTaxDebitMinusCredit());
        Company company2 = new Company("Encounter", new SimpleTaxDebit());
        company1.setTaxSystem(new SimpleTaxDebit());
        company1.shiftMoney(5000);
        company2.shiftMoney(3000);
        company1.payTaxes();
        company2.payTaxes();
        int balance = company1.applyDeals(deals);
        System.out.println(balance);
    }
}