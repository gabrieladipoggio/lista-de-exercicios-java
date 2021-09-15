public class SuperHomem implements Voador{
    public int exp = 100;

    @Override
    public void voar(){
        this.exp += 3;
        System.out.println("Estou voando como um campeão");
    }
}
