public class Exercicio01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabi", "Di Poggio");
        Conta conta1 = new Conta("001", 200, cliente1);

        Cliente cliente2 = new Cliente ("Joao", "Da Silva");
        Conta conta2 = new Conta("002", 300, cliente2);

        conta1.saque(200);
        conta1.deposito(200);

        conta2.deposito(100);
        conta2.saque(300);
    }
}
