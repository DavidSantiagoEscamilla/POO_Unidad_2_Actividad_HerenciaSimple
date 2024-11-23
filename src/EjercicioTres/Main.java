package EjercicioTres;

//Clase principal para probar Empleado y Gerente
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Perez", 50000); 
        Gerente gerente = new Gerente("Laura Gomez", 75000, "Recursos Humanos"); 

        System.out.println("Detalles del Empleado:"); 
        empleado.mostrarDetalles();
        System.out.println("\nDetalles del Gerente:"); 
        gerente.mostrarDetalles(); 
    }
}
