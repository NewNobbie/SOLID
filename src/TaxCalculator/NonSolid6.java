package TaxCalculator;


/*Refactoriza el código para que cumpla con el Principio de Abierto/Cerrado. Debes permitir la extensión de nuevos cálculos de impuestos sin modificar la clase TaxCalculator.*/


/*Pistas

Crea una interfaz TaxStrategy con un método calculateTax.
Implementa esta interfaz en clases concretas para cada país (por ejemplo, USATaxStrategy y UKTaxStrategy).
Modifica TaxCalculator para que use la interfaz TaxStrategy.*/

public class NonSolid6 {

    public class TaxCalculator {
        public double calculateTax(String country) {
            if (country.equals("USA")) {
                // Lógica para calcular el impuesto en USA
                return 0.1;
            } else if (country.equals("UK")) {
                // Lógica para calcular el impuesto en UK
                return 0.2;
            }
            return 0;
        }
    }
}
