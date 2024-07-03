package Employees;


/*Refactoriza la clase Employee para que cumpla con el Principio de Responsabilidad Única. Debes separar las responsabilidades de cálculo, generación de reportes y almacenamiento en clases diferentes.

Pistas

La clase Employee solo debe manejar los datos del empleado.
Crea una nueva clase PayrollService para manejar el cálculo del salario.
Crea una nueva clase EmployeeReport para manejar la generación del reporte.
Crea una nueva clase EmployeeRepository para manejar el almacenamiento en la base de datos.*/
public class NonSolid5 {
    public class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public void calculatePay() {
            // Lógica para calcular el salario
        }

        public void generateReport() {
            // Lógica para generar un reporte del empleado
        }

        public void saveToDatabase() {
            // Lógica para guardar el empleado en la base de datos
        }
    }
}
