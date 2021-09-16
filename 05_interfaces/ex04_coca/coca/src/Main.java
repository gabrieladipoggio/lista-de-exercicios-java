public class Main {
    public static void main(String[] args) {
        Coca c1 = new Coca(500, 2.50);
        Coca c2 = new Coca(500, 3.50);

        if(c1.equals(c2)){
            System.out.println("Mesmo tamanho");
        } else {
            System.out.println("Tamanhos diferentes");
        }

    }
}
