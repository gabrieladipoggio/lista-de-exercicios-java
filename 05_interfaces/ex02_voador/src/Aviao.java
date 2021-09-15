public class Aviao implements Voador {
    public int horas = 0;

    @Override
    public void voar(){
        this.horas += 13;
        System.out.println("Estou voando como um avião");
    }
}
