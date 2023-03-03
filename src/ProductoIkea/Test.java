package ProductoIkea;

public class Test {
    public static void main(String[]args){

    Mueble estanteria = new Mueble("Kallax","200x60", 87.50, TipoMaterial.Madera, "Estantería");

    ArticuloDeDecoracion flexo = new ArticuloDeDecoracion("Forsá", "10x21", 16.75, TipoMaterial.Metal);

    Tienda ikeaSevilla = new Tienda();

    ikeaSevilla.agregarProducto(estanteria);
    ikeaSevilla.agregarProducto(flexo);

    ikeaSevilla.mostrarProducto();

    }
}
