public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabi", "Di Poggio");
        Conta conta = new Conta("001", 200, cliente1);

        conta.saque(300);
    }
}
