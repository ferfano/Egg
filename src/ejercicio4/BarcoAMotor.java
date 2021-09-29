/*
CLASE HIJA DE BARCO Y CLASE MADRE DE YATE.
 */
package ejercicio4;

public class BarcoAMotor extends Barco {

//ATRIBUTO:
    protected int potenciaCV;

//CONSTRUCTORES (propios y de la clase padre):
    public BarcoAMotor(int potenciaCV, String matricula, int eslora, int anioFabricacion, long modulo) {
        super(matricula, eslora, anioFabricacion, modulo);
        this.potenciaCV = potenciaCV;
    }

    public BarcoAMotor() {
    }

//GETTERS & SETTERS:
    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

//MÉTODO PARA CREAR UN BARCO A MOTOR:
    @Override
    public void crearBarco() {
        super.crearBarco();
        eslora = (int) Math.floor(Math.random() * (12) + 4);
        potenciaCV = (int) Math.floor(Math.random() * (581) + 20);
        System.out.println("* Matrícula: " + matricula + "\n"
                + "* Eslora: " + eslora + " m\n"
                + "* Potencia en CV: " + potenciaCV + " CV\n"
                + "* Año de frabricación: " + anioFabricacion);
        modulo = potenciaCV;
    }
}