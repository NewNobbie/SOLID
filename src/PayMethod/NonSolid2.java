package PayMethod;

/*
* Refactoriza el código para que cumpla con el Principio de Abierto/Cerrado. Debes permitir la extensión de nuevos métodos de pago sin modificar la clase PaymentProcessor.
*
* Pistas

Crea una interfaz PaymentMethod con un método processPayment.
Implementa esta interfaz en clases concretas para cada tipo de pago (por ejemplo, CreditCardPayment y PayPalPayment).
Modifica PaymentProcessor para que use la interfaz PaymentMethod.
* */

public class NonSolid2 {
    public class PaymentProcessor {
        public void processPayment(String paymentType) {
            if (paymentType.equals("credit")) {
                // Lógica para procesar el pago con tarjeta de crédito
            } else if (paymentType.equals("paypal")) {
                // Lógica para procesar el pago con PayPal
            }
        }
    }
}
