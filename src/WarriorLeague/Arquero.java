package WarriorLeague;

public class Arquero extends Personaje {

    protected int punteria;
    protected String arco;

    public Arquero() {

    }

    public Arquero(String nombre, int puntosVida, int fuerza, int punteria, String arco) {
        super(nombre, puntosVida, fuerza);
        this.punteria = punteria;
        this.arco = arco;
    }

    public void atacar(){
        System.out.println("El arquero "+this.nombre+" está atacando con su "+arco);
    }

    public void defender(){
        System.out.println("El arquero "+this.nombre+" está defendiendo");
    }

    public String toString() {
        return "Arquero{" +
                ", nombre='" + nombre + '\'' +
                ", puntosVida=" + puntosVida + '\'' +
                ", fuerza=" + fuerza + '\'' +
                ", punteria=" + punteria + '\'' +
                ", arco='" + arco + '\'' +
                '}';
    }
}
