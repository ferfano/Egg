/*
CLASE PADRE SERVICE.
 */
package ejercicio1Ver2;

public class AnimalService {

//MÉTODO ALIMENTARSE:
    public void Alimentarse() {
        Animal a = new Animal();
        System.out.println(a.getNombre() + " es un " + a.getRaza() + " de " + a.getEdad()
                + " años y se alimenta a base de " + a.getAlimento() + ".");
    }
}