package EjercicioDos;


public class Estudiante extends Persona {
    private String matricula;

    //Constructor para Estudiante
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    //Metodo sobrescrito para mostrar información del Estudiante
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Matrícula: " + matricula);
    }
   
}

