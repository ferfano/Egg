/*
CLASE HIJA.
 */
package ejercicioExtra1;

public class Polideportivo extends Edificio {
    
//ATRIBUTOS:
    private String nombre;
    private Boolean Techado;

//CONSTRUCTORES:
    public Polideportivo(String nombre, Boolean Techado, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.Techado = Techado;
    }

    public Polideportivo() {
    }

//GETTERS & SETTERS:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTechado() {
        return Techado;
    }

    public void setTechado(Boolean Techado) {
        this.Techado = Techado;
    }
}