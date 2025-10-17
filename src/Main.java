/**
 * Clase principal del programa.
 * Aquí se instancian objetos de la clase base y de las clases derivadas.
 * Se prueban los métodos para verificar la herencia y el comportamiento de cada clase.
 */
public class Main {
    public static void main(String[] args) {
        // Instancia de empleados base
        Empleado empleado1 = new Empleado("Juan Pérez", 30, 12000.50);
        Empleado empleado2 = new Empleado("Ana López", 25, 15000.00);

        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();

        // Uso de método heredado para aumentar salario
        empleado1.aumentarSalario(2000);
        empleado1.mostrarInformacion();

        // Empleado con constructor vacío
        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Carlos Díaz");
        empleado3.setEdad(40);
        empleado3.setSalario(18000);
        empleado3.mostrarInformacion();

        // Instancia de subclase EmpleadoAdministrativo
        EmpleadoAdministrativo admin = new EmpleadoAdministrativo("Laura Méndez", 28, 14000, "Recursos Humanos");
        admin.mostrarInformacion(); // Método sobrescrito
        admin.organizarReunion("Plan de capacitación"); // Método exclusivo

        // Instancia de subclase EmpleadoTecnico
        EmpleadoTecnico tecnico = new EmpleadoTecnico("Luis Torres", 35, 16000, "Redes");
        tecnico.mostrarInformacion(); // Método sobrescrito
        tecnico.asignarProyecto("Instalación de servidores"); // Método exclusivo

        // Instancia de subclase Gerente
        Gerente gerente = new Gerente("Roberto Gómez", 45, 25000, 10);
        gerente.mostrarInformacion(); // Método sobrescrito
        gerente.evaluarDesempeño(); // Método exclusivo
    }
}
