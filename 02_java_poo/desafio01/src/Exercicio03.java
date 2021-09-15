import javax.swing.*;

public class Exercicio03 {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Rayssa Leal", 10, 100);
        Atleta atleta2 = new Atleta("Rebeca Andrade", 15, 100);

        Prova finalSkate = new Prova(5, 10);
        Prova finalSalto = new Prova(7, 20);
        Prova finalIndividualGeral = new Prova(10, 15);

        finalSkate.podeRealizar(atleta1);
        finalSalto.podeRealizar(atleta2);
        finalIndividualGeral.podeRealizar(atleta2);

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    }
}
