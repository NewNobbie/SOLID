package Database;

/*Refactoriza el código para que cumpla con el Principio de Inversión de Dependencias. Introduce una abstracción para la funcionalidad de almacenamiento de datos.
*
*Pistas

Crea una interfaz DataStorage con un método save.
Implementa DataStorage en la clase Database.
Modifica DataService para que dependa de DataStorage en lugar de Database.
* */

public class Nonsolid {

    public class Database {
        public void save(String data) {
            // Lógica para guardar datos en la base de datos
        }
    }

    public class DataService {
        private Database database = new Database();

        public void saveData(String data) {
            database.save(data);
        }
    }
}
