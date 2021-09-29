/*
CLASE MADRE.
 */
package ejercicio4;

public class Barco {

//ATRIBUTOS (para que las clases hijas puedan acceder a los atributos de la clase madre, estos deben ser "protected"):
    protected String matricula;
    protected int eslora;
    protected int anioFabricacion;
    protected long modulo;

//CONSTRUCTORES:
    public Barco(String matricula, int eslora, int anioFabricacion, long modulo) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.modulo = modulo;
    }

    public Barco() {
    }
 
//GETTERS & SETTERS:
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public long getModulo() {
        return modulo;
    }

    public void setModulo(long modulo) {
        this.modulo = modulo;
    }
    
//COIN TOSS:
    public static int coinToss() {
        if (Math.random() < 0.5) {
            return 0;
        } else {
            return 1;
        }
    }

//MÉTODO PARA CREAR UN BARCO:
    public void crearBarco() {
        String letra;
        if (coinToss() == 1) {
            letra = "A";
        } else {
            letra = "B";
        }
        matricula = Integer.toString((int) Math.floor(Math.random() * (90000) + 10000)) + letra;       
        anioFabricacion = (int) Math.floor(Math.random() * (32) + 1990);
    }
}