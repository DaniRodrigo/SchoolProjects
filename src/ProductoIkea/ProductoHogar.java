package ProductoIkea;

public abstract class ProductoHogar extends Producto{
    TipoMaterial m;

    public ProductoHogar(String nombre, String descripcion, double precio, TipoMaterial m) {
        super(nombre, descripcion, precio);
        this.m = m;
    }

    @Override
    public String toString() {
        return "ProductoHogar{" +
                "m=" + m +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
