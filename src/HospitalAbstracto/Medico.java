package HospitalAbstracto;

public abstract class Medico extends TrabajadorHospital{

    int idColegiado;
    int pacientesAtendidos;

    EspecialidadMedico e;

    public Medico() {
    }

    public Medico(String nombre, int numId, double sueldo, int idColegiado, int pacientesAtendidos, EspecialidadMedico e) {
        super(nombre, numId, sueldo);
        this.idColegiado = idColegiado;
        this.pacientesAtendidos = pacientesAtendidos;
        this.e = e;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "idColegiado=" + idColegiado +
                ", pacientesAtendidos=" + pacientesAtendidos +
                ", e=" + e +
                ", nombre='" + nombre + '\'' +
                ", numId=" + numId +
                ", sueldo=" + sueldo +
                '}';
    }




}
