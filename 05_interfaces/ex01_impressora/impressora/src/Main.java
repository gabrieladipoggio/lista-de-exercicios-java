public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento();
        Contrato contrato = new Contrato();
        Foto foto = new Foto();

        Impressora.adicionarImprimivel(documento);
        Impressora.adicionarImprimivel(contrato);
        Impressora.adicionarImprimivel(foto);

        Impressora.imprimirTudo();
    }
}
