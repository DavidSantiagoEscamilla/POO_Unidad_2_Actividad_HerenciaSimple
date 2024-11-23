package EjercicioUno;

public class Vehiculo {
    private String marca;
    private int velocidadMaxima;

    //Constructor
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    //Metodo para mostrar informacion del Vehiculo
    public void mostrarInformacionVehiculo() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}