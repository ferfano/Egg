/*
INTERFAZ
Similar a las clases abstractas, una interfaz es una colección compuesta por métodos abstractos y
atributos constantes.

MÉTODOS ABSTRACTOS
Un método abstracto es un método declarado pero no implementado. Es decir, es un método del que solo
se escribe su nombre, parámetros y tipo devuelto, pero no su código. En otras palabras, es un método
"vacío".
Los métodos abstractos se escriben sin llaves {} y con ; al final de la declaración.

CONSTANTES
Una constante es una variable del sistema que mantiene un valor inmutable a lo largo de toda la vida
del programa. En Java, las constantes se definen a través del modificador "final", pero como en las
interfaces TODAS las variables y atributos son implícitamente constantes (es decir, "public static
final"), no es necesario especificarlo en su declaración dentro de la interfaz.

Para crear una interfaz, tenemos que hacer:
  * Click derecho sobre el proyecto > New > Java Interface...
O si no lo encuentro ahí:
  * Click derecho sobre el proyecto > New > Other > Categories: Java > File Types: Java Interface...
 */
package ejercicio5;

public interface CalculosFormas {

//ATRIBUTO CONSTANTE:
    Double PI = 3.14;

//MÉTODOS ABSTRACTOS:
    public Double calcularArea();
    public Double calcularPerimetro();
}