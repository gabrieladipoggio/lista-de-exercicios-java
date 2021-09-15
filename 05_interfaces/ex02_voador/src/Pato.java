public class Pato implements Voador{
    public int energia = 100;

    @Override
    public void voar(){
        this.energia -= 5;
        System.out.println("Estou voando como um pato");
    }
}
