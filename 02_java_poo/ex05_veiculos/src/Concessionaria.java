public class Concessionaria {
    public void registrarVenda(Veiculo veiculo, Cliente cliente, double valor){
        System.out.println("Nova venda: \n Veiculo: " + veiculo.marca + " " + veiculo.modelo + " " + veiculo.cor + "\n Cliente: " + cliente.nome + " "+ cliente.sobrenome + "\n Valor: " + valor   );
    }
}
