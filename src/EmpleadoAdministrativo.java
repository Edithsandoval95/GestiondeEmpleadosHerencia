/**
 * Clase derivada de Empleado que representa a un empleado administrativo.
 * Hereda atributos y métodos de la clase base y agrega el atributo 'departamento'.
 */
public class EmpleadoAdministrativo extends Empleado {
    private String departamento; // Atributo exclusivo de esta subclase

    // Constructor que reutiliza el constructor de la clase base
    public EmpleadoAdministrativo(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario); // Llamada al constructor de la clase base
        this.departamento = departamento;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    /**
     * Método sobrescrito que amplía la información mostrada del empleado.
     * Incluye el departamento.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Reutiliza el método de la clase base
        System.out.println("Departamento: " + departamento);
    }

    /**
     * Método exclusivo de esta subclase.
     * Simula la organización de una reunión.
     */
    public void organizarReunion(String tema) {
        System.out.println(getNombre() + " ha organizado una reunión sobre: " + tema);
    }
}