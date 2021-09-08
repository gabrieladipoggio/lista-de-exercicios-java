public class JogadorDeFutebol {
    public String nome;
    public float energia;
    public float alegria;
    public float gols;
    public float experiencia;

    public JogadorDeFutebol(String nome, float energia, float alegria, float gols, float experiencia){
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }

    public void fazerGol(){
        this.energia -= 5;
        this.alegria += 10;
        this.gols += 1;
        System.out.println("GOOOOOOOL!");
    }

    public void correr(){
        this.energia -=10;
        System.out.println("Cansei");
    }
}
