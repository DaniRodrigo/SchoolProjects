package WarriorLeague;

public class Guerrero extends Personaje{
    protected int armadura;
    protected String arma;

    public Guerrero(){

    }

    public Guerrero(String nombre, int puntosVida, int fuerza, int armadura, String arma){
        super(nombre, puntosVida, fuerza);
        this.armadura = armadura;
        this.arma = arma;
    }

    public void atacar(){
        System.out.println("El guerrero "+this.nombre+" está atacando con su "+arma);
    }

    public void defender(){
        System.out.println("El guerrero "+this.nombre+" está defendiendo");
    }

    @Override
    public String toString() {
        return "Guerrero{" +
                ", nombre='" + nombre + '\'' +
                ", puntosVida=" + puntosVida + '\'' +
                ", fuerza=" + fuerza + '\'' +
                ", armadura=" + armadura + '\'' +
                ", arma='" + arma + '\'' +
                '}';
    }
}
