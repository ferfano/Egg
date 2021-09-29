/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y
largo. La clase edificio tendrá como métodos:
  * Método calcularSuperficie(): calcula la superficie del edificio.
  * Método calcularVolumen(): calcula el volumen del edifico.

Estos métodos serán abstractos y los implementarán las siguientes clases:
  * Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado
    o Abierto. Esta clase implementará los dos métodos abstractos y los atributos
    del padre.
  * Clase EdificioDeOficinas con sus atributos de número de oficinas, cantidad de
    personas por oficina y numero de pisos. Esta clase implementará los dos métodos
    abstractos y los atributos del padre.
    De esta clase, nos interesa saber cuántas personas pueden trabajar en todo el
    edificio. El usuario decidirá cuátas personas entrarán en cada oficina, cuántas
    oficinas habrá y el número de piso (suponiendo que en cada piso hay una oficina).
    Crear el método cantPersonas(), que mostrará cuántas personas entrarían en un
    piso y cuantás en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo "Edificio". El ArrayList
debe contener dos polideportivos y dos edificios de oficinas. Luego, vamos a recorrer
este array y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio.
Se deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos
son techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar
al método cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package ejercicioExtra1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioExtra1 {

    public static void main(String[] args) {
        List<Edificio> listaDeEdificios = new ArrayList();
        
        Edificio e = new Edificio();
        
        listaDeEdificios.add(new EdificioDeOficinas());
        listaDeEdificios.add(new EdificioDeOficinas());
        listaDeEdificios.add(new Polideportivo());
        listaDeEdificios.add(new Polideportivo());
        
        for (Edificio edificio : listaDeEdificios) {
            e.calcularSuperficie();
            
        }
        
        
//        Edificio e1 = new EdificioDeOficinas();
//        Edificio e2 = new EdificioDeOficinas();
//        Edificio p1 = new Polideportivo();
//        Edificio p2 = new Polideportivo();
        
        String respuesta = "";

        Scanner leer = new Scanner(System.in);

    }
}
