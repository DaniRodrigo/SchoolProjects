package WarriorLeague;

public class TestWarriorLeague {
    public static void main(String[]args){

        Guerrero guerrero1 = new Guerrero("Daniel",100,500,300,"Martillo de Guerra Loxodon");

        Arquero arquero1 = new Arquero("Alejandro",100,200,500,"Arco de la lujuria");

        Mago mago1 = new Mago("Tito",100,85,1000,"Conchita de Mango");

        Mago mago2 = new Mago("Ramos",100,50,600,"Garrote de pueblo");

        guerrero1.atacar();
        guerrero1.defender();

        arquero1.atacar();
        arquero1.defender();

        mago1.atacar();
        mago1.defender();

        mago2.atacar();

        System.out.println(guerrero1.toString());
        System.out.println(arquero1.toString());
        System.out.println(mago1.toString());
        System.out.println(mago2.toString());

        System.out.println("¿Son los dos magos iguales? "+mago1.equals(mago2));

    }
}
