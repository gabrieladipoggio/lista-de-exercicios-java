public class Funcionario {
    public static void main(String[] args) {
        int ano = 1995;
        double salario = 1000;
        double aumento = 0.015;

        while(ano<= 2021){
            salario = salario + (salario * aumento);
            aumento = aumento * 2;
            System.out.printf("O ano é: " + ano +  " e o salário do funcionário é: R$%.2f \n ", salario);
            ano++;
        }

    }

}
