/*
CLASE PADRE
 */
package ejercicio1;

public class Animal {

//ATRIBUTOS:
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

//CONSTRUCTORES:
    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public Animal() {
    }

//GETTERS & SETTERS:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

//MÉTODO ALIMENTARSE:
    public void Alimentarse() {
        System.out.println(nombre + " es un " + raza + " de " + edad
                + " años y se alimenta a base de " + alimento + ".");
    }
}