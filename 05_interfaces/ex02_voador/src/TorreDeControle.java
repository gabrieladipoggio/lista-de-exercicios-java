public class TorreDeControle {

    public static Voador[] voadores = new Voador[3];


    public static void adicionarVoador(Voador voador) {
        for (int i = 0; i < voadores.length; i++){
            if (voadores[i] == null){
                voadores[i] = voador;
                return;
            }
        }
    }

    public static void voemTodos() {
        for (int i = 0; i < voadores.length; i++){
            if (voadores [i] != null){
                voadores[i].voar();
            }
        }

    }
}
