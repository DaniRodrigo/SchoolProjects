package HospitalAbstracto;

public class TestHospitalAbstracto {
    public static void main(String[]args){

        Cardiologo cardiologo1 = new Cardiologo("Daniel", 288261, 2500, 5674247, 30, EspecialidadMedico.Cardiologo);

        Pediatra pediatra1 = new Pediatra("Alejandro", 56356, 3000, 5637853, 15, EspecialidadMedico.Pediatra);

        Enfermero enfermero1 = new Enfermero("Rocio", 46243, 2000);

        System.out.println("El sueldo de "+cardiologo1.nombre+" es de: "+cardiologo1.calcularSueldo());

        System.out.println("El sueldo de "+pediatra1.nombre+" es de: "+pediatra1.calcularSueldo());

        System.out.println("El sueldo de "+enfermero1.nombre+" es de: "+enfermero1.calcularSueldo());

    }
}
