package TaxCalculator;

public class COTaxStrategy implements TaxStrategy{

    @Override
    public double calculateTax() {
        //Logic to Colombia Taxes
        return 0.16;
    }

}
