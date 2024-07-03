package Worker;

/*Refactoriza el código para que cumpla con el Principio de Segregación de Interfaces. Crea interfaces más específicas para evitar que las clases implementen métodos que no necesitan.
*
* Pistas

Crea una interfaz Workable para la funcionalidad de trabajo.
Crea una interfaz Eatable para la funcionalidad de comer.
Implementa estas interfaces en las clases correspondientes.
* */

public class NonSolid3 {

    public interface Worker {
        void work();
        void eat();
    }

    public class HumanWorker implements Worker {
        @Override
        public void work() {
            // Lógica para trabajar
        }

        @Override
        public void eat() {
            // Lógica para comer
        }
    }

    public class RobotWorker implements Worker {
        @Override
        public void work() {
            // Lógica para trabajar
        }

        @Override
        public void eat() {
            throw new UnsupportedOperationException("Robots don't eat");
        }
    }
}
