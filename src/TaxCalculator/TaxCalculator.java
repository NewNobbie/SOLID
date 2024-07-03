package TaxCalculator;

public class TaxCalculator {
    private TaxStrategy taxStrategy;

    public TaxCalculator(TaxStrategy taxStrategy){
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax(){
        return taxStrategy.calculateTax();
    }
}
