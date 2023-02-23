package HospitalAbstracto;

abstract public class TrabajadorHospital {

    protected String nombre;
    protected int numId;
    double sueldo;

    public TrabajadorHospital() {
    }

    public TrabajadorHospital(String nombre, int numId, double sueldo) {
        this.nombre = nombre;
        this.numId = numId;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "TrabajadorHospital{" +
                "nombre='" + nombre + '\'' +
                ", numId=" + numId +
                ", sueldo=" + sueldo +
                '}';
    }

    public abstract double calcularSueldo();
}