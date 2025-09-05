package ru.netology;

import taxes.TaxSystem;

public class Company {
    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;


    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
        this.debit = 0;
        this.credit = 0;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
            System.out.println("Приход " + amount);
        } else if (amount < 0) {
            credit += Math.abs(amount);
            System.out.println("Расход " + Math.abs(amount));
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s уплатила налог по системе %s в размере: %d руб.\n", title,taxSystem.getNameTaxSystem(), tax);
        debit = 0;
        credit = 0;

    }

    public int applyDeals(Deal[] deals) {
        for (int i = 0; i < deals.length; i++) {
            int debitChange = deals[i].getDebitChange();
            int creditChange = deals[i].getCreditChange();
            debit += debitChange;
            credit += creditChange;
            System.out.println(deals[i].getComment());

        }
        int tax = taxSystem.calcTaxFor(debit, credit);
        return (debit - credit) - tax;
    }
}

