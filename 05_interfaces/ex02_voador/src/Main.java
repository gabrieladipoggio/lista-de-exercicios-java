public class Main {
    public static void main(String[] args) {
        Pato p1 = new Pato();
        Aviao a1 = new Aviao();
        SuperHomem s1 = new SuperHomem();

        TorreDeControle.adicionarVoador(a1);
        TorreDeControle.adicionarVoador(p1);
        TorreDeControle.adicionarVoador(s1);

        TorreDeControle.voemTodos();

    }
}
