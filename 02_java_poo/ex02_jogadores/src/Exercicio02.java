public class Exercicio02 {
    public static void main(String[] args) {
        JogadorDeFutebol jogador1 = new JogadorDeFutebol("Neymar", 100, 0, 0, 0);
        JogadorDeFutebol jogador2 = new JogadorDeFutebol("Ronaldinho", 100, 0, 0, 0);

        SessaoDeTreinamento treino1 = new SessaoDeTreinamento();

        treino1.treinarA(jogador1);
        treino1.treinarA(jogador2);
    }
}
