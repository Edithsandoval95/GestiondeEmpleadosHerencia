/**
 * Clase derivada de Empleado que representa a un empleado técnico.
 * Hereda atributos y métodos de la clase base y agrega el atributo 'especialidad'.
 */
public class EmpleadoTecnico extends Empleado {
    private String especialidad; // Atributo exclusivo

    public EmpleadoTecnico(String nombre, int edad, double salario, String especialidad) {
        super(nombre, edad, salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    /**
     * Método sobrescrito para mostrar también la especialidad técnica.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad técnica: " + especialidad);
    }

    /**
     * Método exclusivo que simula la asignación de un proyecto técnico.
     */
    public void asignarProyecto(String proyecto) {
        System.out.println(getNombre() + " ha sido asignado al proyecto: " + proyecto);
    }
}