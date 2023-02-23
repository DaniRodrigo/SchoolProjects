package HospitalAbstracto;

abstract public class TrabajadorNoMedico extends TrabajadorHospital{

    public TrabajadorNoMedico() {
    }

    public TrabajadorNoMedico(String nombre, int numId, double sueldo) {
        super(nombre, numId, sueldo);
    }

    public abstract double calcularSueldo();
}
