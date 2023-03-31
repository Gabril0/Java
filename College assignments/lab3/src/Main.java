import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op;
        Director quentin = new Director();
        Scanner in = new Scanner(System.in);
        while(true){
        System.out.println("=== Builder Souls ===");
        System.out.println("♫ musica triste medieval ♫");
        System.out.println("1.Novo Jogo");
        System.out.println("2.Continuar");
        System.out.println("3.Opcoes");
        System.out.println("0.Sair");
        System.out.println("Escolha uma opcao:");
        op = in.nextInt();
        in.nextLine(); //buffer cleaning
        switch (op) {
            case 1:
                quentin.criaPersonagem();
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                System.exit(1);
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
        }
    }
}