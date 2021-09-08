public class Programador extends Funcionario{

    private double horasTrabalhadas;
    private double valorHora;

    public Programador(double salario){
        super(salario);
    }

    public void estudarJava(){
        System.out.println("Estudando Java");
    }

    public void calcularSalario(double horasTrabalhadas, double valorHora){
        var valorSalario = horasTrabalhadas * valorHora;
        this.setSalario(valorSalario);
        System.out.println("O seu salário é: R$" + this.getSalario());
    }

}