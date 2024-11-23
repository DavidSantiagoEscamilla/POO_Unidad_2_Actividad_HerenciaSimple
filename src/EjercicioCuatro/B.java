package EjercicioCuatro;

public class ClaseDerivada extends ClaseBase {
    public void mostrarAtributo() {
        //Accede al atributo privado de la clase base a traves de un metodo público
        System.out.println("Accediendo al atributo privado: " + getAtributoPrivado());
    }
}
