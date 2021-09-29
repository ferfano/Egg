/*
Tenemos una clase padre "Animal" junto con sus 3 clases hijas: "Perro", "Gato" y
"Caballo".
La clase Animal tendrá como atributos el nombre, el alimento, la edad y la raza.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta.
 */
package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println("");
        Animal perro = new Perro("Stitch", "carnívoro", 15, "doberman");
        perro.Alimentarse(); //Método overriden.
        
        Perro perro1 = new Perro("Teddy", "croquetas", 10, "chihuahua");
        perro1.AlimentarseParentClass(); //Método que utiliza el "super" para acceder a la clase padre.

        Animal gato = new Gato("Pelusa", "galletas", 15, "siamés");
        gato.Alimentarse(); //Método directo de la clase padre.
        
        Animal caballo = new Caballo("Spark", "pasto", 25, "fino");
        caballo.Alimentarse(); //Método overriden.
        System.out.println("");
    }
}