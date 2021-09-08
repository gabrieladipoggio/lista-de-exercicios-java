public class SessaoDeTreinamento {

    public void treinarA(JogadorDeFutebol jogador){
        System.out.println("XP inicial: "+jogador.experiencia);
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        jogador.experiencia++;
        System.out.println("XP final: " + jogador.experiencia);
    }
}
