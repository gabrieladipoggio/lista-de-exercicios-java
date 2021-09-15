public class Impressora {
   public static Imprimivel[] listaDeImpressao = new Imprimivel[3];
    public static int posicao = -1;

    public static void imprimirTudo(){
        for (int i = 0; i < listaDeImpressao.length; i++) {
            listaDeImpressao[i].imprimir();
        }
    }

    public static void adicionarImprimivel(Imprimivel imprimivel){
        posicao++;
        listaDeImpressao[posicao] = imprimivel;
    }

}
