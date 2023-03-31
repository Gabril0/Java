import java.util.Scanner;

public class Director implements Builder{
        Hero hero = new Hero();
    public Hero criaPersonagem(){
        boolean flag = false;
        int op;
        Scanner in = new Scanner(System.in);
        while(!flag) {
            System.out.println("== Criacao de Personagem ==");
            System.out.println("1.Escolha de nome");
            System.out.println("2.Escolha de classe");
            System.out.println("3.Escolha de atributos"); //LEMBRAR DE RANDOMIZAR ATRIBUTOS
            System.out.println("4.Escolha de equipamentos");
            System.out.println("5.Finalizar");
            System.out.println("Escolha uma opcao:");
            op = in.nextInt();
            in.nextLine(); //buffer cleaning
            switch (op) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    flag = true;
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
        }
        return hero;
    }

    @Override
    public void reset() {
        hero = new Hero();
    }

    @Override
    public void stepName(String name) {
        hero.setName(name);
    }

    @Override
    public void stepClass() {

    }

    @Override
    public void stepStats() {

    }

    @Override
    public void stepEquip() {

    }
}
