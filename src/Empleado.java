/**
 * Clase base que representa a un empleado genérico.
 * Contiene atributos comunes como nombre, edad y salario.
 * Esta clase será heredada por otras clases más específicas.
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    // Constructor vacío
    public Empleado() {}

    // Constructor con parámetros
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Métodos GET y SET para encapsulamiento
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    /**
     * Método que muestra la información básica del empleado.
     * Puede ser sobrescrito por las clases derivadas.
     */
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre +
                " | Edad: " + edad +
                " | Salario: $" + salario);
    }

    /**
     permite aumentar el salario del empleado.
     * Reutilizable por las subclases.
     */
    public void aumentarSalario(double incremento) {
        this.salario += incremento;
        System.out.println("El salario de " + nombre + " ha sido aumentado en $" + incremento);
    }
}