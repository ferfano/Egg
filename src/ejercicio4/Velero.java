/*
CLASE HIJA.
 */
package ejercicio4;

public class Velero extends Barco {

//ATRIBUTO:
    private int mastiles;

//CONSTRUCTORES (propios y de la clase padre):
    public Velero(int mastiles, String matricula, int eslora, int anioFabricacion, long modulo) {
        super(matricula, eslora, anioFabricacion, modulo);
        this.mastiles = mastiles;
    }

    public Velero() {
    }

//GETTERS & SETTERS:
    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

//MÉTODO PARA CREAR UN VELERO:
    @Override
    public void crearBarco() {
        super.crearBarco();
        eslora = (int) Math.floor(Math.random() * (12) + 4);
        mastiles = (int) Math.floor(Math.random() * (6) + 2);
        System.out.print("* Matrícula: " + matricula + "\n"
                + "* Eslora: " + eslora + " m\n"
                + "* Cantidad de mástiles: " + mastiles + "\n"
                + "* Año de frabricación: " + anioFabricacion + "\n");       
        modulo = mastiles;
    }
}