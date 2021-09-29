/*

 */
package ejercicio5;

public class Circulo implements CalculosFormas {

//ATRIBUTOS:
    private Double radio;
    private Double diametro;

//CONSTRUCTORES:
    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo() {
    }

//GETTERS & SETTERS:
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

//MÉTODO PARA CALCULAR EL ÁREA:
    @Override
    public Double calcularArea() {
        return PI * Math.pow(radio, 2); //PI * radio ^ 2.
    }

//MÉTODO PARA CALCULAR EL PERÍMETRO:
    @Override
    public Double calcularPerimetro() {
        return PI * diametro;
    }
}