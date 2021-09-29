/*
CLASE HIJA.
 */
package ejercicio3;

public class Televisor extends Electrodomestico {

//ATRIBUTOS:
    private Integer resolucion;
    private Boolean sintonizadorTDT;

//CONSTRUCTORES:
    public Televisor(Integer resolucion, Boolean sintonizadorTDT, Double precio, String color, Character consumoEnergético, Double peso) {
        super(precio, color, consumoEnergético, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor() {
    }

//GETTERS & SETTERS:
    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

//MÉTODO PARA CREAR UN TELEVISOR:
    public Double crearTelevisor() {
        if (sintonizadorTDT){
        System.out.println("TELEVISOR " + color.toUpperCase() + " DE " + resolucion + " PULGADAS CON SINTONIZADOR TDT");
        } else {
        System.out.println("TELEVISOR " + color.toUpperCase() + " DE " + resolucion + " PULGADAS");
        }
        Double precioAux = crearElectrodomestico();
        return precioAux;
    }

//MÉTODO PARA CALCULAR EL PRECIO FINAL DE LA LAVADORA:
    @Override
    public void precioFinal() {
        Double precioAux2 = crearTelevisor();
        if (resolucion >= 40) {
            precioAux2 = precioAux2 + (precioAux2 * 0.3);
        }
        if (sintonizadorTDT) {
            precioAux2 += 500;
        }
        System.out.println("* PRECIO FINAL: $" + precioAux2);
    }
}
