/*
CLASE PADRE.
 */
package ejercicio3;

import java.util.Scanner;

public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//ATRIBUTOS:
    protected Double precio;
    protected String color;
    protected Character consumoEnergético;
    protected Double peso;

//CONSTRUCTORES:
    public Electrodomestico(Double precio, String color, Character consumoEnergético, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergético = consumoEnergético;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

//GETTERS & SETTERS:
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergético() {
        return consumoEnergético;
    }

    public void setConsumoEnergético(Character consumoEnergético) {
        this.consumoEnergético = consumoEnergético;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

//MÉTODO PARA COMPROBAR EL CONSUMO ENERGÉTICO DEL ELECTRODOMÉSTICO:
    private char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra >= 65 && letra <= 70) { //Es decir, entre la A y la F mayúsculas del código ASCII.
            consumoEnergético = letra;
        } else {
            consumoEnergético = 'F';
        }
        return consumoEnergético;
    }

//MÉTODO PARA VALIDAR EL COLOR DEL ELECTRODOMÉSTICO:
    private void comprobarColor(String color) {

        color = color.toLowerCase();

        switch (color) {
            case "blanco":
                this.color = "blanco";
                break;
            case "negro":
                this.color = "negro";
                break;
            case "rojo":
                this.color = "rojo";
                break;
            case "azul":
                this.color = "azul";
                break;
            case "gris":
                this.color = "gris";
                break;
            default:
                this.color = "blanco";
        }
    }

//MÉTODO PARA CREAR EL ELECTRODOMÉSTICO:
    public Double crearElectrodomestico() {
        comprobarColor(color);

        switch (comprobarConsumoEnergetico(consumoEnergético)) {
            case 'A':
                precio = 1000.0;
                break;
            case 'B':
                precio = 800.0;
                break;
            case 'C':
                precio = 600.0;
                break;
            case 'D':
                precio = 500.0;
                break;
            case 'E':
                precio = 300.0;
                break;
            case 'F':
                precio = 100.0;
                break;
            default:
                precio = 1000.0; //F.
        }
        precio += 1000;

        if (peso >= 1 && peso <= 19) {
            precio += 100;
        } else if (peso >= 20 && peso <= 49) {
            precio += 500;
        } else if (peso >= 50 && peso <= 79) {
            precio += 800;
        } else if (peso >= 80) {
            precio += 1000;
        }
        return precio;
    }

//MÉTODO PARA CALCULAR EL PRECIO FINAL DEL ELECTRODOMÉSTICO:
    public void precioFinal() {
        crearElectrodomestico();
    }
}