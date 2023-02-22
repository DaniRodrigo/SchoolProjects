package Hospital;

public class TrabajadorNoMedico extends Trabajador{
    String areaTrabajo;
    EspecialidadNoMedico e;

    public TrabajadorNoMedico() {
    }


    public TrabajadorNoMedico(String nombre, int numIdentificador, double sueldo, String areaTrabajo, EspecialidadNoMedico e) {
        super(nombre, numIdentificador, sueldo);
        this.areaTrabajo = areaTrabajo;
        this.e = e;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public EspecialidadNoMedico getE() {
        return e;
    }

    public void setE(EspecialidadNoMedico e) {
        this.e = e;
    }

    @Override
    public String toString() {
            return super.toString() +" "+this.areaTrabajo +" "+this.e;
        }
    }

