import java.util.ArrayList;

public class Usuario {
    private String email;
    private String password;
    private ArrayList<String> publicaciones;

    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
        this.publicaciones = new ArrayList<>();
    }

    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public ArrayList<String> getPublicaciones() { return publicaciones; }

    public void agregarPublicacion(String post) {
        this.publicaciones.add(post);
    }
}
