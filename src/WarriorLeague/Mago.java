package WarriorLeague;

public class Mago extends Personaje {

    protected int magia;
    protected String varita;

    public Mago() {

    }

    public Mago(String nombre, int puntosVida, int fuerza, int magia, String varita) {
        super(nombre, puntosVida, fuerza);
        this.magia = magia;
        this.varita = varita;
    }

    public void atacar(){
        System.out.println("El mago "+this.nombre+" está atacando con su "+varita);
    }

    public void defender(){
        System.out.println("El mago "+this.nombre+" está defendiendo");
    }

    public String toString() {
        return "Mago{" +
                ", nombre='" + nombre + '\'' +
                ", puntosVida=" + puntosVida + '\'' +
                ", fuerza=" + fuerza + '\'' +
                ", magia=" + magia + '\'' +
                ", varita='" + varita + '\'' +
                '}';
    }
}
