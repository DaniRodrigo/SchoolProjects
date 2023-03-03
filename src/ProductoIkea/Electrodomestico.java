package ProductoIkea;

public class Electrodomestico extends ProductoHogar{
    EficienciaEnergetica e;

    public Electrodomestico(String nombre, String descripcion, double precio, TipoMaterial m, EficienciaEnergetica e) {
        super(nombre, descripcion, precio, m);
        this.e = e;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "e=" + e +
                ", m=" + m +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
