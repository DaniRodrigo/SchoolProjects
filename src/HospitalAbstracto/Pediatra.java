package HospitalAbstracto;

public class Pediatra extends Medico{

    public Pediatra() {
    }

    public Pediatra(String nombre, int numId, double sueldo, int idColegiado, int pacientesAtendidos, EspecialidadMedico e) {
        super(nombre, numId, sueldo, idColegiado, pacientesAtendidos, e);
    }

    @Override
    public double calcularSueldo() {
        return this.sueldo+pacientesAtendidos*300;
    }
}
