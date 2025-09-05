package taxes;

public class ComplexTaxDebitMinusCredit extends TaxSystem {
    public ComplexTaxDebitMinusCredit() {
        super("СДмР");
    }

    @Override
    public int calcTaxFor(int debit, int credit) {
        return Math.max(0, (15 * (debit - credit) / 100));
    }
}
