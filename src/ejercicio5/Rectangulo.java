/*
Para implementar una interfaz, simplemente debo poner al lado del nombre de la clase
"[...] implements Interfaz1, Interfaz2, Interfaz3 {".
Si, además de la interfaz, quiero implementar una clase madre, puedo hacerlo mediante
"[...] extends ClaseMadre implements Interfaz1, Interfaz2, Interfaz3 {".

Una vez implementada la interfaz, me va a saltar un error. Para corregir esto, debemos
hacer click izquierdo sobre el error y seleccionar "Implement all abstract methods".
 */
package ejercicio5;

public class Rectangulo implements CalculosFormas {

//ATRIBUTOS:
    private Double base;
    private Double altura;

//CONSTRUCTORES:
    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

//GETTERS & SETTERS:
    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

//MÉTODO PARA CALCULAR EL ÁREA:
    @Override
    public Double calcularArea() {
       return base * altura;
    }

//MÉTODO PARA CALCULAR EL PERÍMETRO:
    @Override
    public Double calcularPerimetro() {
        return (base + altura) * 2;
    }
}