/*
CLASE HIJA
 */
package ejercicio1;

public class Caballo extends Animal {

//CONSTRUCTORES (clase padre):
    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Caballo() {
    }

//MÉTODO ALIMENTARSE:
    @Override
    public void Alimentarse() {
        System.out.println(nombre + " es un caballo " + raza + " de " + edad
                + " años y se alimenta a base de " + alimento + ".");
    }
}