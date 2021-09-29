/*
CLASE HIJA.
 */
package ejercicio3;

public class Lavadora extends Electrodomestico {   

//ATRIBUTO:
    private Integer carga;

//CONSTRUCTORES:
    public Lavadora(Integer carga, Double precio, String color, Character consumoEnergético, Double peso) {
        super(precio, color, consumoEnergético, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

//GETTERS Y SETTERS:
    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

//MÉTODO PARA CREAR UNA LAVADORA:
    public Double crearLavadora() {
        System.out.println("LAVADORA DE " + carga + " CARGAS");
        Double precioAux = crearElectrodomestico();
        
        return precioAux;
    }

//MÉTODO PARA CALCULAR EL PRECIO FINAL DE LA LAVADORA:
    @Override
    public void precioFinal() {
  Double precioAux2 = crearLavadora();
        if (carga > 30) {
            precioAux2 += 500;
        }
        System.out.println("* PRECIO FINAL: $" + precioAux2);
    }
}