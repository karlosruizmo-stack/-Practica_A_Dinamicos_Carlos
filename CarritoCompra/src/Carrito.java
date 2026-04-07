import java.util.HashMap;
import java.util.Map;

public class Carrito {
    private HashMap<Producto, Integer> productos;

    public Carrito() {
        this.productos = new HashMap<>();
    }


    public void agregarProducto(Producto p, int cantidad) {
        if (productos.containsKey(p)) {

            productos.put(p, productos.get(p) + cantidad);
        } else {
            productos.put(p, cantidad);
        }
    }

    public void generarTicket() {
        System.out.println("----- TICKET METADONA -----");
        double total = 0;

        for (Map.Entry<Producto, Integer> entrada : productos.entrySet()) {
            Producto p = entrada.getKey();
            int cantidad = entrada.getValue();
            double subtotal = p.getPrecio() * cantidad;
            total += subtotal;

            System.out.printf("%-15s x%d - %.2f€ (Subtotal: %.2f€)%n",
                    p.getNombre(), cantidad, p.getPrecio(), subtotal);
        }

        System.out.println("---------------------------");
        System.out.printf("TOTAL: %.2f€%n", total);
    }
}
