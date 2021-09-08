public class Conta {
    private String numero;
    private double saldo;
    private Cliente titular;


    public void deposito(double valor){
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso. O seu novo saldo é: R$"+saldo);
    }

    public void saque(double valor){
        if(valor <= this.saldo){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. O seu novo saldo é: R$"+saldo);
        } else {
            System.out.println("Saldo indisponível");
        }

    }

    public Conta(String numero, double saldo, Cliente titular){
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }


}
