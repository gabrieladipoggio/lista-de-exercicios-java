public class Tripe {
    public boolean dobrado;
    public double alturaMinima;
    public double alturaMaxima;
    public double alturaAtual;

    public Tripe(boolean dobrado, double alturaMinima, double alturaMaxima, double alturaAtual) {
        this.dobrado = dobrado;
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.alturaAtual = alturaAtual;
    }

    public void definirAltura(double novaAltura){
        this.alturaAtual = novaAltura;
    }

    public void dobrar(){
        this.dobrado = true;
    }

    public void desdobrar(){
        this.dobrado = false;
    }

    public void guardar(){
        this.dobrado = true;
        this.alturaAtual = this.alturaMinima;
    }

    public void prontoParaGuardar(){
        if(this.dobrado && this.alturaAtual == alturaMinima){
            System.out.println("O tripé está pronto para ser guardado");
        } else {
            System.out.println("Por favor, dobre o tripé antes de guardá-lo");
        }
    }

    public void usar(){
        this.dobrado = false;
        this.alturaAtual = alturaMaxima/2;
    }

    public void prontoParaUsar(){
        if(!this.dobrado && this.alturaAtual == alturaMaxima/2){
            System.out.println("O tripé está pronto para ser usado");
        } else {
            System.out.println("Por favor, desdobre o tripé antes de usá-lo");
        }
    }

}
