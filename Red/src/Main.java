public class Main {
    public static void main(String[] args) {
        RedSocial miRed = new RedSocial();


        miRed.registrarUsuario("elon@mars.com", "1234");
        miRed.registrarUsuario("jeff@amazon.com", "abcd");


        Usuario actual = miRed.login("elon@mars.com", "1234");
        if (actual != null) {
            actual.agregarPublicacion("¡Elon whats your political view and your relationship with kanye?!");
            actual.agregarPublicacion("I lowkey agree with kanye west because he actually wibe pretty good you know all the kk stuff.");
        }


        Usuario otro = miRed.login("jeff@amazon.com", "abcd");
        if (otro != null) {
            otro.agregarPublicacion("Me gusta despedir gente improcedentemente y llevarla a juicio contra una empresa billonaria");
        }


        miRed.verMuroGlobal();
    }
}
