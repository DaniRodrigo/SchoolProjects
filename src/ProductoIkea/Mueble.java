package ProductoIkea;

public class Mueble extends ProductoHogar{
    String tipoDeMueble;

    public Mueble(String nombre, String descripcion, double precio, TipoMaterial m, String tipoDeMueble) {
        super(nombre, descripcion, precio, m);
        this.tipoDeMueble = tipoDeMueble;
    }

    @Override
    public String toString() {
        return "Mueble{" +
                "tipoDeMueble='" + tipoDeMueble + '\'' +
                ", material=" + m +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
