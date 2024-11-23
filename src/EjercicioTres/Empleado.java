package EjercicioTres;

public class Empleado {
    private String nombre; 
    private double salario; 

    //Constructor para Empleado
    public Empleado(String nombre, double salario) {
        this.nombre = nombre; 
        this.salario = salario; 
    }

    //Metodo para mostrar detalles del Empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre); 
        System.out.println("Salario: " + salario); 
    }


}
