public class Estagiario extends Funcionario{

    private double horasTrabalhadas;
    private double valorHora;

    public Estagiario(double salario){
        super(salario);
    }

    public void tirarXerox(){
        System.out.println("Tirando xerox");
    }

    public void calcularSalario(double horasTrabalhadas, double valorHora){
        var valorSalario = horasTrabalhadas * valorHora;
        this.setSalario(valorSalario);
        System.out.println("O seu salário é: R$" + this.getSalario());
    }

}