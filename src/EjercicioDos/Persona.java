package EjercicioDos;

public class Persona {
    //Atributos de la clase Persona
    private String nombre;
    private int edad;

    //Constructor para Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo para mostrar información de la Persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}
