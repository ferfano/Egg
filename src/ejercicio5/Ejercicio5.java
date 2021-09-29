/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este cálculo
se va a repetir en las dos formas geométricas, vamos a crear una Interfaz, llamada
"CalculosFormas" que tendrá, los dos métodos para calcular el área, el perímetro y
el valor de PI como constante. Desarrollar el ejercicio de tal forma que las formas
implementen los métodos de la interfaz, y se calcule el área y el perímetro de los
dos. En el main se crearán las formas y se mostrará el resultado final.

Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo();

        System.out.print("\nCÍRCULO\n"
                + "* Radio: ");
        c.setRadio(leer.nextDouble());
        System.out.print("* Diámetro: ");
        c.setDiametro(leer.nextDouble());
        System.out.println("ÁREA: " + c.calcularArea()
                + "\nPERÍMETRO: " + c.calcularPerimetro() + "\n");

        System.out.print("RECTÁNGULO\n"
                + "* Base: ");
        r.setBase(leer.nextDouble());
        System.out.print("* Altura: ");
        r.setAltura(leer.nextDouble());
        System.out.println("ÁREA: " + r.calcularArea()
                + "\nPERÍMETRO: " + r.calcularPerimetro() + "\n");
    }
}