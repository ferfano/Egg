/*
CLASE HIJA.
 */
package ejercicioExtra1;

import java.util.Scanner;

public class EdificioDeOficinas extends Edificio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//ATRIBUTOS:
    private Integer cantOficinas;
    private Integer cantPersonas;
    private Integer cantPisos;

//CONSTRUCTORES:
    public EdificioDeOficinas(Integer cantOficinas, Integer cantPersonas, Integer cantPisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.cantOficinas = cantOficinas;
        this.cantPersonas = cantPersonas;
        this.cantPisos = cantPisos;
    }

    public EdificioDeOficinas() {
    }

//GETTERS & SETTERS:
    public Integer getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(Integer cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public Integer getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(Integer cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public void Usuario() {
        System.out.print("* Ancho: ");
        ancho = leer.nextInt();
        System.out.print("* Alto: ");
        alto = leer.nextInt();
        System.out.print("* Largo: ");
        largo = leer.nextInt();

        System.out.print("\nSUPERFICIE: " + calcularSuperficie()
                + "\nVOLUMEN: " + calcularVolumen() + "\n"
                + "\n* Cantidad de oficinas: ");
        cantOficinas = leer.nextInt();
        System.out.print("* Cantidad de pisos: ");
        cantPisos = leer.nextInt();
        System.out.print("* Cantidad de personas por piso: ");
        cantPersonas = leer.nextInt();
    }
}