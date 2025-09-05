package taxes;

public class TaxSystem {
    private String nameTaxSystem;

    public TaxSystem(String nameTaxSystem) {
        this.nameTaxSystem = nameTaxSystem;
    }

    public String getNameTaxSystem() {
        return nameTaxSystem;
    }

    public int calcTaxFor(int debit, int credit) {
        return 0;
    }
}

