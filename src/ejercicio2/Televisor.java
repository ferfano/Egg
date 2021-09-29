/*
CLASE HIJA.
 */
package ejercicio2;

public class Televisor extends Electrodomestico {

//ATRIBUTOS:
    private Integer resolucion;
    private Boolean sintonizadorTDT;

//CONSTRUCTORES:
    public Televisor(Double precio, String color, Character consumoEnergético, Double peso) {
        super(precio, color, consumoEnergético, peso);
        this.sintonizadorTDT = false;
    } /*Constructores heredados de la clase padre.*/
    
    public Televisor(Integer resolucion, Boolean sintonizadorTDT) {
        this.sintonizadorTDT = false;
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    } /*Constructores propios (de los atributos "resolucion" y "sintonizadorTDT").*/
    
    public Televisor() {
        this.sintonizadorTDT = false;
    } /*Constructor vacío.*/
    
//GETTERS Y SETTERS:
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
        System.out.println("TELEVISOR");
        Double precioAux = crearElectrodomestico();

        System.out.print("* Pulgadas: ");
        resolucion = leer.nextInt();

        System.out.print("* Sintonizador TDT (Sí/No): ");
        String respuesta = leer.next();
        while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
            System.out.print("Respuesta inválida. Por favor, inténtelo de nuevo.\n"
                    + "* Sintonizador TDT (Sí/No): ");
            respuesta = leer.next();
        }
        if (respuesta.equalsIgnoreCase("si")) {
            sintonizadorTDT = true;
        }
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