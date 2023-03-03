package ProductoIkea;

public class ArticuloDeDecoracion extends ProductoHogar{

    public ArticuloDeDecoracion(String nombre, String descripcion, double precio, TipoMaterial m) {
        super(nombre, descripcion, precio, m);
    }

    @Override
    public String toString() {
        return "ArticuloDeDecoracion{" +
                "material=" + m +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
