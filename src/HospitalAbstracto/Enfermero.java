package HospitalAbstracto;

public class Enfermero extends TrabajadorNoMedico{


    public Enfermero() {
    }

    public Enfermero(String nombre, int numId, double sueldo) {
        super(nombre, numId, sueldo);
    }



    @Override
    public double calcularSueldo() {
        return this.sueldo;
    }
}
