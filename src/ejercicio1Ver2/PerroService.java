/*
CLASE HIJA SERVICE.
 */
package ejercicio1Ver2;

public class PerroService extends AnimalService {

//MÉTODO ALIMENTARSE OVERRIDEN:
    @Override
    public void Alimentarse() {
        Animal a = new Animal();

        System.out.println(a.getNombre() + " es un " + a.getRaza() + " de " + a.getEdad() + " meses y es "
                + a.getAlimento() + ".");
    }

//MÉTODO ALIMENTARSE DE LA PARENT CLASS:
    public void AlimentarseParentClass() {
        super.Alimentarse();
    }
}