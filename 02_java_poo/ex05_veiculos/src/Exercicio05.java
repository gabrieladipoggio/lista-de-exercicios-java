public class Exercicio05 {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Ford", "Fiesta", "2018", "Vermelho", "100km");
        Cliente cliente1 = new Cliente("Gabriela", "Di Poggio", "gabrieladipoggio");

        Venda venda1 = new Venda(cliente1, veiculo1, 15000);

        Concessionaria concessionaria = new Concessionaria();

        concessionaria.registrarVenda(veiculo1, cliente1,15000);


    }
}
