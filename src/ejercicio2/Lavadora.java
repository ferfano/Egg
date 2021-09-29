/*
CLASE HIJA.
 */
package ejercicio2;

public class Lavadora extends Electrodomestico {

//ATRIBUTO:
    private Integer carga;

//CONSTRUCTORES:
    public Lavadora(Double precio, String color, Character consumoEnergético, Double peso) {
        super(precio, color, consumoEnergético, peso);
    } /*Constructores heredados de la clase padre.*/

    public Lavadora(Integer carga) {
        this.carga = carga;
    } /*Constructor propio (del atributo "carga").*/

    public Lavadora() {
    } /*Constructor vacío.*/

//GETTERS Y SETTERS:
    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

//MÉTODO PARA CREAR UNA LAVADORA:
    public Double crearLavadora() {
        System.out.println("\nLAVADORA");
        Double precioAux = crearElectrodomestico();

        System.out.print("* Cantidad de carga (kg): ");
        carga = leer.nextInt();
        
        return precioAux;
    }

//MÉTODO PARA CALCULAR EL PRECIO FINAL DE LA LAVADORA:
    @Override
    public void precioFinal() {
        Double precioAux2 = crearLavadora();
        if (carga > 30) {
            precioAux2 += 500;
        }
        System.out.println("* PRECIO FINAL: $" + precioAux2 + "\n");
    }
}