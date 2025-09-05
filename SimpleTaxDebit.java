package taxes;

public class SimpleTaxDebit extends TaxSystem {
    public SimpleTaxDebit() {
        super("УСН");
    }

    @Override
    public int calcTaxFor(int debit, int credit) {
        return (6 * debit / 100);
    }
}
