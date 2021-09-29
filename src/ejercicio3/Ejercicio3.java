/*
Siguiendo el ejercicio anterior, en el main de este ejercicio, vamos a crear un
arrayList de Electrodoméstico para guardar 4 electrodomésticos, ya sean lavadoras
o televisores, con valores ya asignados.
Luego, vamos a recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico.
Se deberá también mostrar el precio de cada tipo de objeto (es decir, el precio
de todos los televisores, por un lado, el de las lavadoras por otro, y al final,
la suma del precio de todos los Electrodomésticos. Por ejemplo, si tenemos una
lavadora con un precio de 2000 y un televisor de 5000, el resultado final será de
7000 (2000+5000) para electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package ejercicio3;

import java.util.List;
import java.util.ArrayList;

public class Ejercicio3 {

    public static void main(String[] args) {
        List<Electrodomestico> lista = new ArrayList();
        double total = 0;
        
        
        lista.add(new Lavadora(7, 0.0, "blanco", 'F', 30.0));
        lista.add(new Lavadora(12, 0.0, "gris", 'B', 50.0));
        lista.add(new Televisor(50, true, 0.0, "negro", 'A', 25.0));
        lista.add(new Televisor(32, false, 0.0, "gris", 'C', 7.5));
        
        System.out.println("");
        
        for (Electrodomestico elementosGuardados : lista) {         
            elementosGuardados.precioFinal();
            System.out.println("");
            total += elementosGuardados.precio;
        }
        System.out.println("TOTAL: $" + total + "\n");   
    }
}
