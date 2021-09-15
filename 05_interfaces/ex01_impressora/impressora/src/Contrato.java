public class Contrato implements Imprimivel {
    public String nome = "contrato_de_locacao";
    public String tipo = ".pdf";

    @Override
    public void imprimir() {
        System.out.println( nome + tipo);
        System.out.println("Sou um contrato muito legal");
    }
}
