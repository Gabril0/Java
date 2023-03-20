import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Marcas marca;
        String carro;
        Scanner in = new Scanner(System.in);
        int op;
        while (true) {
            System.out.println("=== Concessionaria ===");
            System.out.println("Escolha uma marca:");
            System.out.println("1.Toyota");
            System.out.println("2.Honda");
            System.out.println("3.Sair");
            System.out.printf("Opcao: ");
            op = in.nextInt();
            switch (op) {
                case 1:
                    marca = new Toyota();
                    carro = selecionaCarro(marca);
                    marca.geraCarro(carro);
                    marca.geraCarro(carro).especificacoes();
                    break;
                case 2:
                    marca = new Honda();
                    carro = selecionaCarro(marca);
                    marca.geraCarro(carro);
                    marca.geraCarro(carro).especificacoes();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }

    public static String selecionaCarro(Marcas marca) {
        Scanner in = new Scanner(System.in);
        int op;
        if (marca.getNome().compareTo("Toyota") == 0) {
            System.out.println("Selecione um carro");
            System.out.println("1.Toyota 1");
            System.out.println("2.Toyota 2");
            System.out.printf("Opcao: ");
            op = in.nextInt();
            switch(op){
                case 1: return "T1";
                case 2: return "T2";
                default: return null;
            }
        }
        if (marca.getNome().compareTo("Honda") == 0) {
            System.out.println("Selecione um carro");
            System.out.println("1.Honda 1");
            System.out.println("2.Honda 2");
            System.out.printf("Opcao: ");
            op = in.nextInt();
            switch(op){
                case 1: return "H1";
                case 2: return "H2";
                default: return null;
            }
        }
        else return null;
    }
}