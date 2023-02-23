package HospitalAbstracto;

public class Cardiologo extends Medico{

    public Cardiologo() {
    }

    public Cardiologo(String nombre, int numId, double sueldo, int idColegiado, int pacientesAtendidos, EspecialidadMedico e) {
        super(nombre, numId, sueldo, idColegiado, pacientesAtendidos, e);
    }



    @Override
    public double calcularSueldo() {
        return this.sueldo+pacientesAtendidos*100;
    }
}
