package ru.netology;

import taxes.TaxSystem;

public class Company {
    protected String title;
    protected int debit;
    protected int credit;
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
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s уплатила налог в размере: %d руб.\n", title, tax);
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        for (int i = 0; i < deals.length; i++) {
            int debitChange = deals[i].debitChange;
            int creditChange = deals[i].creditChange;
            debit += debitChange;
            credit += creditChange;
        }
        int tax = taxSystem.calcTaxFor(debit, credit);
        return (debit - credit) - tax;
    }
}

