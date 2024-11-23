package EjercicioDos;


public class Main {
    public static void main(String[] args) {
        //Crear objetos de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Ana", 17, "E4444");
        Estudiante estudiante2 = new Estudiante("Carlos", 18, "E2222");

        //Mostrar informacion del primer estudiante
        System.out.println("Información del Estudiante 1:");
        estudiante1.mostrarInformacion();

        //Mostrar informacion del segundo estudiante
        System.out.println("\nInformación del Estudiante 2:");
        estudiante2.mostrarInformacion();
    }
}
