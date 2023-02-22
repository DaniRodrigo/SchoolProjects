package Hospital;

public class TestHospital {
    public static void main(String[]args){

        Medico medico1 = new Medico("Daniel Rodrigo", 28826162, 5000, EspecialidadMedico.Pediatra, 32649191, 17);

        TrabajadorNoMedico trabajadorNoMedico1 = new TrabajadorNoMedico("Alejandro Brome", 3465643, 1580.20, "2º Planta", EspecialidadNoMedico.limpiador);

        Trabajador trabajador1 = new Trabajador("Tito José", 5869353, 3000.50);

        System.out.println(medico1);
        System.out.println(trabajadorNoMedico1);
        System.out.println(trabajador1);
    }
}
