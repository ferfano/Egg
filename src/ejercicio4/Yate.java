/*
CLASE HIJA.
 */
package ejercicio4;

public class Yate extends BarcoAMotor { /*Porque comparten un atributo (potenciaCV) que lo heredo directamente de
                                          BarcosAMotor, y también heredo los atributos y métodos de Barco, que ya
                                          están incluidos dentro de BarcoAMotor.*/
//ATRIBUTO:
    private int camarotes;

//CONSTRUCTORES (propios y de la clase padre):
    public Yate(int camarotes, int potenciaCV, String matricula, int eslora, int anioFabricacion, long modulo) {
        super(potenciaCV, matricula, eslora, anioFabricacion, modulo);
        this.camarotes = camarotes;
    }

    public Yate() {
    }

//GETTERS & SETTERS:
    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

//MÉTODO PARA CREAR UN YATE:
    @Override
    public void crearBarco() {
        String letra;
        if (coinToss() == 1) {
            letra = "A";
        } else {
            letra = "B";
        }
        matricula = Integer.toString((int) Math.floor(Math.random() * (90000) + 10000)) + letra;
        anioFabricacion = (int) Math.floor(Math.random() * (32) + 1990);
        eslora = (int) Math.floor(Math.random() * (197) + 4);
        camarotes = (int) Math.floor(Math.random() * (47) + 4);
        while (camarotes > eslora) {
            camarotes = (int) Math.floor(Math.random() * (47) + 4);
        }
        potenciaCV = (int) Math.floor(Math.random() * (581) + 20);
        System.out.println("* Matrícula: " + matricula + "\n"
                + "* Eslora: " + eslora + " m\n"
                + "* Nro. de camarotes: " + camarotes + "\n"
                + "* Potencia en CV: " + potenciaCV + " CV\n"
                + "* Año de frabricación: " + anioFabricacion);
        modulo = camarotes;
    }
}