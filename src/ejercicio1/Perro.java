/*
CLASE HIJA
 */
package ejercicio1;

public class Perro extends Animal {

//CONSTRUCTORES (clase padre):
    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Perro() {
        super();
    }

//MÉTODO ALIMENTARSE:
    @Override
    public void Alimentarse() {
        System.out.println(nombre + " es un " + raza + " de " + edad + " meses y es "
                + alimento + ".");
    }

//MÉTODO ALIMENTARSE DE LA PARENT CLASS:
    public void AlimentarseParentClass() {
        super.Alimentarse();
    }
}