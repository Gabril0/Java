public class Vetor {
    private String nome;
    private int idade;

    Vetor(String nomeCon, int idadeCon){ // construtor
        nome = nomeCon;
        idade = idadeCon;
    }
    
    public int retornaIdade(){ // metodo para retornar a idade para o programa
        return idade;
    }

    public String retornaNome(){ // metodo para retornar o nome para o programa
        return nome;
    }
}

