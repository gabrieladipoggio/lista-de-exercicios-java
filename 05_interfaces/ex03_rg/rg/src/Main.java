public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gabriela", 123456);
        Pessoa p2 = new Pessoa("João", 123456);


        // Sem Override imprime "É diferente", sobrescrevendo com Override é igual.
        if (p1.equals(p2)){
            System.out.println("É igual");
        } else {
            System.out.println("É diferente");
        }
    }
}
