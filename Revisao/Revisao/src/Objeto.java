public class Objeto {
    private int valorPrivado; // valor privado que somente pode ser alterado por funcoes
    public int valorPublico; // valor publico que pode ser alterado por qualquer um que crie um objeto

    Objeto(int valorPassado){
        valorPrivado = valorPassado; // passando o valor da chamada da funcao para a dentro do objeto
        System.out.printf("Construtor criado com sucesso!!");
    }

    public void printValor(){ // print dos valores para visualizacao
        System.out.printf("\nValor privado: %d",valorPrivado);
        System.out.printf("\nValor publico: %d",valorPublico);

    }
}
