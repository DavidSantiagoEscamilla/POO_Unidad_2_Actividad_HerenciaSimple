package EjemploSeis.ParteDos;

public class Coche {
    public void mostrarMarca() {
        System.out.println(marca); // Error de compilación: 'marca' tiene acceso privado
    }
}