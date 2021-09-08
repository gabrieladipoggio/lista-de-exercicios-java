public class Gerente extends Funcionario{

    private double horasTrabalhadas;
    private double valorHora;

    public Gerente(double salario){
        super(salario);
    }

    public void calcularSalario(double horasTrabalhadas, double valorHora){
        var valorSalario = horasTrabalhadas * valorHora;
        this.setSalario(valorSalario);
        System.out.println("O seu salário é: R$" + this.getSalario());
    }

}
