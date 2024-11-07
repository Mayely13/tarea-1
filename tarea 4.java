import java.util.ArrayList;

// Clase Empleado
class Empleado {
    // Atributos privados
    private String nombre;
    private int edad;
    private double salario;

    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Métodos públicos para acceder y modificar los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para imprimir la información del empleado
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario);
    }
}

// Clase GestorEmpleados
class GestorEmpleados {
    private ArrayList<Empleado> empleados;

    // Constructor
    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    // Método para agregar un empleado
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Método para mostrar los detalles de los empleados
    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            empleado.imprimirInformacion();
        }
    }
}

// Clase Main
public class Main {
    public static void main(String[] args) {
        // Crear instancia del gestor de empleados
        GestorEmpleados gestor = new GestorEmpleados();

        // Crear instancias de empleados
        Empleado emp1 = new Empleado("Juan Pérez", 30, 3000.00);
        Empleado emp2 = new Empleado("María López", 25, 2500.00);

        // Agregar empleados al gestor
        gestor.agregarEmpleado(emp1);
        gestor.agregarEmpleado(emp2);

        // Mostrar detalles de los empleados
        gestor.mostrarEmpleados();
    }
}
