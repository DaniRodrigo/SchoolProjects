package Hospital;

public class Trabajador {
    protected String nombre;
    protected int numIdentificador;
    protected double sueldo;

    public Trabajador() {
    }

    public Trabajador(String nombre, int numIdentificador, double sueldo) {
        this.nombre = nombre;
        this.numIdentificador = numIdentificador;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumIdentificador() {
        return numIdentificador;
    }

    public void setNumIdentificador(int numIdentificador) {
        this.numIdentificador = numIdentificador;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return this.nombre +" "+this.numIdentificador +" " +this.sueldo;
    }
}
