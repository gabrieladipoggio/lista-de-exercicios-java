public class Venda {
    public Cliente cliente;
    public Veiculo veiculo;
    public double valor;

    public Venda(Cliente cliente, Veiculo veiculo, double valor) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valor = valor;
    }
}
