package ProductoIkea;

import java.util.ArrayList;

public class Tienda {

    ArrayList<Producto> productos = new ArrayList<Producto>();

    public Tienda() {
    }

    public void agregarProducto(Producto p){
        this.productos.add(p);
    }

    public void mostrarProducto(){
            for(Producto p:productos){
                System.out.println(p);
        }
    }


}
