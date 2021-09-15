public class Foto implements Imprimivel {
    public String nome = "Foto001";
    public String tipo = ".jpg";

    @Override
    public void imprimir() {
        System.out.println( nome  + tipo);
        System.out.println("Sou uma selfie");
    }
}
