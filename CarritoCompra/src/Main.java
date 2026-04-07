public class Main {
    public static void main(String[] args) {
        Carrito miCarrito = new Carrito();

        Producto p1 = new Producto("Leche", 1.20);
        Producto p2 = new Producto("Pan", 0.85);

        miCarrito.agregarProducto(p1, 3);
        miCarrito.agregarProducto(p2, 1);
        miCarrito.agregarProducto(p1, 2);

        miCarrito.generarTicket();
    }
}