package EjercicioTres;


public class Gerente extends Empleado {
    private String local; 

    
    public Gerente(String nombre, double salario, String local) {
        super(nombre, salario); 
        this.local = local; 
    }

    //Metodo sobrescrito para mostrar detalles del Gerente
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Local: " + local); 
    }

    
}
