package Orders;

import java.util.List;

/*Refactoriza la clase Order para que cumpla con el Principio de Responsabilidad Única. Debes separar las responsabilidades de cálculo, impresión y almacenamiento en clases diferentes.

Pistas:

La clase Order solo debe gestionar los datos de la orden.
Crea una nueva clase para manejar la impresión de la orden.
Crea una nueva clase para manejar el almacenamiento de la orden en la base de datos.*/

public class NonSolid {

    public class Order {
        private List<String> items;
        private double totalAmount;

        public Order(List<String> items) {
            this.items = items;
            this.totalAmount = calculateTotal();
        }

        private double calculateTotal() {
            // Lógica para calcular el total de la orden
            return 100.0; // simplificado
        }

        public void printOrder() {
            // Lógica para imprimir la orden
        }

        public void saveToDatabase() {
            // Lógica para guardar la orden en la base de datos
        }
    }
}
