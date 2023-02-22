package Hospital;

public class Medico extends Trabajador{
    EspecialidadMedico e;
    int idColegiado;
    int pacientesAtendidos;

    public Medico() {
    }

    public Medico(String nombre, int numIdentificador, double sueldo, EspecialidadMedico e, int idColegiado, int pacientesAtendidos) {
        super(nombre, numIdentificador, sueldo);
        this.e = e;
        this.idColegiado = idColegiado;
        this.pacientesAtendidos = pacientesAtendidos;
    }

    public EspecialidadMedico getE() {
        return e;
    }

    public void setE(EspecialidadMedico e) {
        this.e = e;
    }

    public int getIdColegiado() {
        return idColegiado;
    }

    public void setIdColegiado(int idColegiado) {
        this.idColegiado = idColegiado;
    }

    public int getPacientesAtendidos() {
        return pacientesAtendidos;
    }

    public void setPacientesAtendidos(int pacientesAtendidos) {
        this.pacientesAtendidos = pacientesAtendidos;
    }


    @Override
    public String toString() {
        return super.toString() +" "+this.e +" "+this.idColegiado +" "+this.pacientesAtendidos;
    }
}
