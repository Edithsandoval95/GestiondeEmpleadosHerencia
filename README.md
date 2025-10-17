# Aplicación de Gestión de Empleados en Java

## 📘 Introducción
Este proyecto demuestra el uso del paradigma de programación orientada a objetos en Java, aplicando el concepto de **herencia** para modelar diferentes tipos de empleados dentro de una empresa. La clase base `Empleado` contiene atributos y métodos comunes, mientras que las clases derivadas (`EmpleadoAdministrativo`, `EmpleadoTecnico`, `Gerente`) extienden su funcionalidad con características específicas.

## 📂 Estructura del proyecto
- `Empleado.java`: Clase base con atributos comunes.
- `EmpleadoAdministrativo.java`: Subclase con atributo `departamento` y método `organizarReunion()`.
- `EmpleadoTecnico.java`: Subclase con atributo `especialidad` y método `asignarProyecto()`.
- `Gerente.java`: Subclase con atributo `empleadosACargo` y método `evaluarDesempeño()`.
- `Main.java`: Clase principal que instancia objetos y prueba la herencia.

## ▶️ Instrucciones para compilar y ejecutar
1. Asegúrate de tener instalado Java (JDK).
2. Coloca todos los archivos `.java` en el mismo directorio.
3. Abre una terminal en ese directorio.
4. Compila los archivos:
   ```
   javac *.java
   ```
5. Ejecuta el programa:
   ```
   java Main
   ```

## ✅ Conclusión
Este proyecto ejemplifica cómo aplicar la herencia en Java para representar jerarquías de clases de manera eficiente. Al reutilizar atributos y métodos de la clase base, se reduce la duplicación de código y se mejora la organización del sistema. Las clases derivadas permiten extender el comportamiento de los objetos, adaptándolos a necesidades específicas como administración, soporte técnico o gestión. Esta estructura facilita la escalabilidad y el mantenimiento del software.
