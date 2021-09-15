public class Prova {
    public float dificuldade;
    public float energiaNecessaria;

    public Prova(float dificuldade, float energiaNecessaria) {
        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;
    }

    public void podeRealizar(Atleta atleta){
        if(atleta.energia >= this.energiaNecessaria && atleta.nivel >= this.dificuldade){
            System.out.println("O atleta pode realizar a prova");
            atleta.nivel++;
            atleta.energia -= this.energiaNecessaria;
            System.out.println("Novo nível: "+ atleta.nivel);
            System.out.println("Energia restante: "+ atleta.energia);
        }
    }
}
