package EjercicioUno;

public class Main {
    public static void main(String[] args) {
        //Crear un objeto de la clase Vehiculo
        Vehiculo vehiculo = new Vehiculo("Toyota", 180);

        //Crear un objeto de la clase Coche
        Coche coche = new Coche("Honda", 200, 4);

        //Mostrar información del Vehiculo
        System.out.println("Información del Vehiculo:");
        vehiculo.mostrarInformacionVehiculo();

        //Mostrar informacion del Coche
        System.out.println("\nInformación del Coche:");
        coche.mostrarInformacionCoche();
    }
}
