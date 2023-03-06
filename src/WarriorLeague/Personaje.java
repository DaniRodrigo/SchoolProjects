package WarriorLeague;

abstract public class Personaje {
    protected String nombre;
    protected int puntosVida;
    protected int fuerza;

    public Personaje() {

    }

    public Personaje(String nombre, int puntosVida, int fuerza) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.fuerza = fuerza;
    }

    abstract public void atacar();

    abstract public void defender();

    @Override
    public String toString() {
        return "Personaje{" +
                ", nombre='" + nombre + '\'' +
                ", puntosVida=" + puntosVida + '\'' +
                ", fuerza=" + fuerza + '\'' +
                '}';
    }
}
