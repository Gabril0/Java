import java.util.Random;
import java.util.Scanner;

public class Director implements Builder{
        Scanner in = new Scanner(System.in);
        Hero hero = new Hero();
    public Hero criaPersonagem(){
        boolean flag = false;
        int op;
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
                    escolhaNome();
                    break;
                case 2:
                    escolhaClasse();
                    break;
                case 3:
                    escolhaAtributos();
                    break;
                case 4:
                    escolhaEquipamentos();
                    break;
                case 5:
                    System.out.println(hero.toString());
                    flag = true;
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
        }
        return hero;
    }

    public void escolhaNome(){
        String nome;
        System.out.printf("Digite seu nome desejado: ");
        nome = in.nextLine();
        stepName(nome);
    }
    public void escolhaClasse(){
        int op;
        System.out.println("Escolha sua classe");
        System.out.println("1.Despojado");
        System.out.println("2.Mago");
        System.out.println("3.Arqueiro");
        System.out.println("4.Carrasco");
        System.out.println("5.Cavaleiro");
        System.out.println("6.Piromantico");
        System.out.println("7.Ladrao");
        System.out.printf("Escolha: ");
        op = in.nextInt();
        in.nextLine();
        switch(op){
            case 1: stepClass("Despojado"); break;
            case 2: stepClass("Mago"); break;
            case 3: stepClass("Arqueiro"); break;
            case 4: stepClass("Carrasco"); break;
            case 5: stepClass("Cavaleiro"); break;
            case 6: stepClass("Piromantico"); break;
            case 7: stepClass("Ladrao"); break;
            default:
                System.out.println("opcao invalida"); break;
        }

    }
    public void escolhaAtributos(){
        int hardCap = 70;
        int pontosRestantes = hardCap;
        int op;
        int[] stats = new int[7];
        String[] listaDeNomes = {"Forca","Velocidade","Inteligencia","Sentidos","Destreza","Adaptabilidade","Vida"};

        System.out.println("Deseja randomizar os atributos?");
        System.out.println("1.Sim");
        System.out.println("2.Nao");
        System.out.printf("Opcao: ");
        op = in.nextInt();
        switch (op){
            case 1: randomizar();
                System.out.println("Atributos randomizados com sucesso!!"); return;
            case 2: break;
            default:
                System.out.println("Valor invalido"); break;
        }
        for(int i = 0; i<stats.length;i++) {
            System.out.printf("Digite sua "+ listaDeNomes[i] + "(Você tem " + pontosRestantes + " pontos restantes): ");
            stats[i] = in.nextInt();
            pontosRestantes = pontosRestantes - stats[i];
            if (pontosRestantes > 0) {
                System.out.println("Atribuido com sucesso");
            }
            if(stats[i] > hardCap){
                System.out.println("Erro!! Atributo acima do valor permitido, personagem teve sua build randomizada, tente novamente");
                randomizar();
                return;
            }
            if(pontosRestantes < 0) {
                pontosRestantes = pontosRestantes + stats[i];
                stats[i] = 0;
                System.out.println("Status definido para 0 pois usou todos os pontos disponíveis");};
        }
        stepStats(stats[0],stats[1],stats[2],stats[3],stats[4],stats[5],stats[6]);
        System.out.println("Personagem definido com sucesso!!");
    }
    public void randomizar(){
        Random r = new Random();
        stepStats(r.nextInt(10),r.nextInt(10),r.nextInt(10),r.nextInt(10),r.nextInt(10),r.nextInt(10),r.nextInt(10));
    }
    public void escolhaEquipamentos(){
        int op1,op2;
        String[] options = {"Osso do regresso", "Anel da vida","Bomba incendiaria","Joia do rejuvenescimento","Tocha","Kit de reparos"};
        System.out.println("Escolha seu primeiro equipamento");
        System.out.println("1.Osso do regresso");
        System.out.println("2.Anel da vida");
        System.out.println("3.Bomba incendiaria");
        System.out.println("4.Joia do rejuvenescimento");
        System.out.println("5.Tocha");
        System.out.println("6.Kit de reparos");
        System.out.println("Escolha:");
        op1 = in.nextInt();
        System.out.println("Escolha seu segundo equipamento");
        System.out.println("1.Osso do regresso");
        System.out.println("2.Anel da vida");
        System.out.println("3.Bomba incendiaria");
        System.out.println("4.Joia do rejuvenescimento");
        System.out.println("5.Tocha");
        System.out.println("6.Kit de reparos");
        System.out.println("Escolha:");
        op2 = in.nextInt();
        stepEquip(options[op1-1],options[op2-1]);

    }

    public void enfrentarLorde(){
        if(hero != null) {
            System.out.println("Pulamos toda a historia e chegamos para a parte final, onde o heroi " + hero.getName() + " enfrenta o lorde malvado");
            while (hero.getHealth() > 0) {
                System.out.println(hero.getName() + " tenta conversar com o vilao");
                if (hero.getInteligence() > 10) {
                    System.out.println("Como era muito inteligente, conseguiu convencer o vilão a parar de fazer maldades e viveram felizes para sempre");
                    return;
                }
                System.out.println(hero.getName() + " falhou em enganar o vilao e recebeu 2 pontos de dano");
                hero.setHealth(hero.getHealth() - 2);
                System.out.println("Em seguida, " + hero.getName() + " tentou bater no vilao.");
                if (hero.getStrength() > 10) {
                    System.out.println("Destruiu o vilao em pedacinhos com um unico soco e agora vive feliz para sempre");
                    return;
                }
                System.out.println(hero.getName() + " falhou em bater no vilao e recebeu 2 pontos de dano");
                hero.setHealth(hero.getHealth() - 2);
                System.out.println(hero.getName() + " entao tenta usar um de seus equipamentos");
                if (hero.getEquipamento1().compareTo("Bomba incendiaria") == 0 || hero.getEquipamento2().compareTo("Bomba incendiaria") == 0) {
                    System.out.println("Tira de sua mochila uma Bomba incendiaria e queima o lorde das trevas, derrotando-o e vivendo feliz para sempre");
                    return;
                }
                System.out.println(hero.getName() + " ficou parado pois nao tinha nada de importante em sua bolsa e recebeu 2 pontos de dano");
                hero.setHealth(hero.getHealth() - 2);
                System.out.println(hero.getName() + " entao pensa se poderia ter feito algo diferente para ganhar a luta");
                System.out.println(hero.getName() + " lembra-se que esta em um jogo em que apenas 3 estrategias funcionam para derrotar o vilao por preguica do desenvolvedor");
                System.out.println("Entao " + hero.getName() + "vai repetir as mesmas acoes, sabendo de sua derrota, mas esperando que no trabalho final de POO2 o desenvolvedor faca um jogo melhor");
        }
            System.out.println(hero.getName() + " Morreu pois seus pontos de vida chegaram a 0");
        }
        else System.out.println("Crie um heroi antes de enfrentar o Lorde Malvado");
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
    public void stepClass(String classe) {
        hero.setClasse(classe);
    }

    @Override
    public void stepStats(int strength, int speed, int inteligence, int senses, int dexterity, int adaptability, int health) {
        hero.setStrength(strength);
        hero.setSpeed(speed);
        hero.setInteligence(inteligence);
        hero.setSenses(senses);
        hero.setDexterity(dexterity);
        hero.setAdaptability(adaptability);
        hero.setHealth(health);
    }

    @Override
    public void stepEquip(String equipamento1, String equipamento2) {
        hero.setEquipamento1(equipamento1);
        hero.setEquipamento2(equipamento2);
    }
}
