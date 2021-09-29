/*
CLASE MADRE.
 */
package ejercicioExtra1;

public class Edificio {

//ATRIBUTOS:
    protected Integer ancho;
    protected Integer alto;
    protected Integer largo;

//CONSTRUCTORES:
    public Edificio(Integer ancho, Integer alto, Integer largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Edificio() {
    }

//SETTERS & GETTERS:
    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

//MÉTODO PARA CALCULAR LA SUPERFICIE DEL EDIFICIO:
    public int calcularSuperficie() {
        return ancho * largo;
    }

//MÉTODO PARA CALCULAR EL VOLUMEN DEL EDIFICIO:
    public int calcularVolumen() {
        return ancho * largo * alto;
    }
}