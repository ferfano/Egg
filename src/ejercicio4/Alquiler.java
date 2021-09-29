package ejercicio4;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//ATRIBUTOS:
    private String nombre;
    private int DNI;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDeDevolucion;
    private int posicionAmarre;
    private Barco barco;

//CONSTRUCTORES:
    public Alquiler(String nombre, int DNI, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Alquiler() {
    }

//GETTERS & SETTERS:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

//MÉTODO PARA ALQUILAR UN BARCO:
    public void alquilarUnBarco() {
        //Menú:
        String respuesta = "";
        System.out.print("\nBienvenido a nuestra aplicación de locación de buques.\n"
                + "Para alquilar una nave, complete los datos a continuación:\n"
                + "\n* NOMBRE: ");
        nombre = leer.nextLine();
        System.out.print("* DNI: ");
        DNI = leer.nextInt();

        while (!respuesta.equalsIgnoreCase("si")) {
            System.out.print("\n¿Qué tipo de nave quiere alquilar?\n"
                    + "1. Barco a motor.\n"
                    + "2. Velero.\n"
                    + "3. Yate.\n"
                    + "\nOPCIÓN: ");
            int opcion = leer.nextInt();
            while (opcion != 1 && opcion != 2 && opcion != 3) {
                System.out.println("\nOpción inválida. Inténtelo de nuevo.");
                System.out.print("OPCIÓN: ");
                opcion = leer.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.println("BARCO A MOTOR");
                    BarcoAMotor b = new BarcoAMotor();
                    b.crearBarco();
                    barco = b;
                    break;
                case 2:
                    System.out.println("VELERO");
                    Velero v = new Velero();
                    v.crearBarco();
                    barco = v;
                    break;
                case 3:
                    System.out.println("YATE");
                    Yate y = new Yate();
                    y.crearBarco();
                    barco = y;
            }
            System.out.print("¿Quiere alquilar esta nave? (Sí/No): ");
            respuesta = leer.next();
            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                System.out.print("\nRespuesta inválida. Por favor, inténtelo de nuevo.\n"
                        + "¿Quiere alquilar esta nave? (Sí/No): ");
                respuesta = leer.next();
            }
        }
        //Cálculo del precio final:
        respuesta = "";
        while (!respuesta.equalsIgnoreCase("si")) {
            System.out.print("Por favor, ingrese la fecha de devolución (DD/MM/AAAA): ");
            String devolucionAux = leer.next();
            while (!devolucionAux.matches("\\d{2}/\\d{2}/\\d{4}")) { //"\\d" = dígito y entre corchetes va la cantidad.
                System.out.print("Fecha incorrecta. Inténtelo de nuevo: ");
                devolucionAux = leer.next();
            }
            fechaDeAlquiler = LocalDate.now(); //Guardamos la fecha actual en fecha de alquiler.

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Usamos un formatter para poder pasar el String a LocalDate.

            fechaDeDevolucion = LocalDate.parse(devolucionAux, formatter); //Pasamos la fecha auxiliar (String) a LocalDate.

            long diferencia = ChronoUnit.DAYS.between(fechaDeAlquiler, fechaDeDevolucion); /*Sacamos la diferencia de días usando "ChronoUnit":
                                                                                             ChronoUnit.DAYS.between(fechaInicial, fechaFinal).
                                                                                             La variable en la que se almacena ChronoUnit tiene
                                                                                             que ser SÍ O SÍ un long.*/
            long precio = diferencia * (barco.getEslora() * 10) + barco.getModulo();

            System.out.print("\n¿QUIERE ALQUILAR ESTA NAVE POR $ " + precio + " DURANTE " + diferencia + " DÍAS? (Sí/No): ");
            respuesta = leer.next();
            System.out.println("");
            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                System.out.print("\nRespuesta inválida. Por favor, inténtelo de nuevo.\n"
                        + "¿Quiere alquilar esta nave? (Sí/No): ");
                respuesta = leer.next();
            }
        }
        //Amarre:
        System.out.println("Excelente. Su barco está amarrado en el muelle "
                + (posicionAmarre = (int) Math.floor(Math.random() * (50) + 1))
                + ".\nGracias por confiar en nosotros.\n");
    }
}