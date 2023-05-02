import java.util.Scanner;

public class menu {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    PrevisaoTempo pt = new PrevisaoTempo();
    Jornal j = new Jornal();
    Aeroporto a = new Aeroporto();
    Agricultor ag = new Agricultor();
    
    System.out.println("=== Bem vindo a previsao do tempo ===");
    System.out.println("1.Fazer previsao do tempo");
    System.out.println("2.Adicionar observadores");
    System.out.println("3.Remover observadores");
    System.out.println("4.Ver observadores");
    System.out.println("0.Sair");
    System.out.println("Selecione uma opcao: ");

    int op = in.nextInt();
    in.nextLine(); //limpeza de buffer

    switch(op){
        case 1:
            pt.fazPrevisao();
            break;

        case 2: // Por questao de tempo nao implementei o menu de cadastro pois seria bastante trabalhoso, entao alteracoes sao feitas no proprio codigo
                // O jeito mais bonito seria fazer um metodo addEventListener e removeEventListener e fazer com que ele adicionasse de forma dinamica na lista 
            pt.adicionarObservador(j);
            pt.adicionarObservador(a);
            pt.adicionarObservador(ag);
            break;

        case 3:
            pt.removerObservador(j);
            pt.adicionarObservador(a);
            pt.adicionarObservador(ag);
            break;

        case 4:
            pt.verObservadoresAtivos();
            break;

        case 0:
            System.exit(0);
            break;
        default:
            System.out.println("Opcao invalida");
            break;
        }
    }
}
