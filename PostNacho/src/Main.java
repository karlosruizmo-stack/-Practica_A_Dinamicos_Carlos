import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Post> mapaPosts = new HashMap<>();

        Post nuevoPost = new Post(
                "PostNacho",
                "Carlos",
                "https://www.google.com/search?sca_esv=d4a33b81dd8689c6&sxsrf=ANbL-n4rWKQDIbfQOaEWQj-m7eX6M4GsiQ:1775550373487&udm=2&fbs=ADc_l-a2SlE6SL3huXjdznPe49WRtCaKEbo6Bs_NfMTVbhF7kNJN3zkHB3s3f4C65Vh3xzWzyjIguZOMtRbanvb0YLrRseoFgFV4Opc4tfPUw6Bo45pZuj_fuIxIfEiCDZb5YHhFUq3n-j8e3tQkRLwbocV4g5-RruZUCi-PQummj9ao0uWu6y7vVtTpbPtDvKzljB4FjsLe&q=shitpost&sa=X&ved=2ahUKEwjOoavKqNuTAxWATaQEHZVLHe4QtKgLegQIDxAB&biw=1536&bih=826&dpr=1.25#sv=CAMSXhoyKhBlLTVOeGdBUmpSVDlUUzJNMg41TnhnQVJqUlQ5VFMyTToOUzZpQndlZ2xwZ21GUk0gBCokCg5vMnNvVVdIdGYwS1VsTRIQZS01TnhnQVJqUlQ5VFMyTRgAMAEYByC7uJLaBUoIEAEYASABKAE"
        );


        mapaPosts.put(nuevoPost.getNombrePost(), nuevoPost);


        String jsonParaEnviar = nuevoPost.toString();
        System.out.println("JSON generado:");
        System.out.println(jsonParaEnviar);


        if (mapaPosts.containsKey("PostNacho")) {
            System.out.println("Post encontrado en el sistema.");
        }
    }
}
