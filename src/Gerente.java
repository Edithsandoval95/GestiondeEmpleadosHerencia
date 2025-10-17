/**
 * Clase derivada de Empleado que representa a un gerente.
 * Hereda atributos y métodos de la clase base y agrega el atributo 'empleadosACargo'.
 */
public class Gerente extends Empleado {
    private int empleadosACargo; // Atributo exclusivo

    public Gerente(String nombre, int edad, double salario, int empleadosACargo) {
        super(nombre, edad, salario);
        this.empleadosACargo = empleadosACargo;
    }

    public int getEmpleadosACargo() { return empleadosACargo; }
    public void setEmpleadosACargo(int empleadosACargo) { this.empleadosACargo = empleadosACargo; }

    /**
     * Método sobrescrito para mostrar también la cantidad de empleados a cargo.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Empleados a cargo: " + empleadosACargo);
    }

    /**
     * Método exclusivo que simula la evaluación del desempeño del equipo.
     */
    public void evaluarDesempeño() {
        System.out.println(getNombre() + " está evaluando el desempeño de su equipo.");
    }
}