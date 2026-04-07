import java.util.HashMap;

public class RedSocial {
    // HashMap: Key = Email, Value = Objeto Usuario
    private HashMap<String, Usuario> baseDatos;

    public RedSocial() {
        this.baseDatos = new HashMap<>();
    }


    public void registrarUsuario(String email, String password) {
        if (!baseDatos.containsKey(email)) {
            baseDatos.put(email, new Usuario(email, password));
            System.out.println("Usuario registrado con éxito.");
        } else {
            System.out.println("El correo ya está en uso.");
        }
    }


    public Usuario login(String email, String password) {
        Usuario u = baseDatos.get(email);
        if (u != null && u.getPassword().equals(password)) {
            System.out.println("Sesión iniciada como: " + email);
            return u;
        }
        System.out.println("Datos incorrectos.");
        return null;
    }


    public void verMuroGlobal() {
        System.out.println("--- MURO GLOBAL ---");
        for (Usuario u : baseDatos.values()) {
            System.out.println("Posts de [" + u.getEmail() + "]:");
            for (String post : u.getPublicaciones()) {
                System.out.println("- " + post);
            }
        }
    }
}
