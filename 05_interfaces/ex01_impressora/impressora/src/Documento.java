public class Documento implements Imprimivel {
    public String nome = "tcc_final";
    public String tipo = ".docx";

    @Override
    public void imprimir() {
        System.out.println(nome + tipo);
        System.out.println("Sou um documento do Word");
    }
}
