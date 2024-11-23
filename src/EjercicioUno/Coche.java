package EjercicioUno;

class Coche extends Vehiculo {
    private int numeroDePuertas;

    //Constructor 
    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    //Metodo para mostrar informacion del Coche
    public void mostrarInformacionCoche() {
        mostrarInformacionVehiculo();
        
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }
}