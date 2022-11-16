import java.util.Scanner;

public class App{ // arquivo principal
    public static void main(String[] args){ // main
        Scanner in = new Scanner(System.in); // criacao de um scanner para a leitura
        

        int valor;// variaveis
        int n;
        String lerNome;
        int lerInt;
        System.out.printf("\n\n== Atribuicao de valores por construtor ==");
        System.out.printf("\nDigite o valor privado: ");
        valor = in.nextInt(); // leitura do valor para a variavel 

        Objeto obj = new Objeto(valor); // criacao de um objeto e atribuicao de valor privado
        obj.valorPublico = 5;  // mudanca do valor publico

        obj.printValor(); // chamar uma funcao dentro do objeto(metodo)
        System.out.printf("\n\n== Registro de alunos com vetor ==");
        System.out.printf("\nNumero de alunos que vao ser registrados: ");
        n = in.nextInt(); // lendo o numero que sera usado para o n valor de objetos no vetor
        Vetor[] vet = new Vetor[n]; // definicao do VETOR, nao do objeto
        
        

        for(int i = 0; i < n; i++){ // registro dos alunos
            System.out.printf("\nDigite o nome do aluno %d: ",i);
            lerNome = in.next();
            System.out.printf("\nDigite a idade do aluno %d: ",i);
            lerInt = in.nextInt();
            vet[i] = new Vetor(lerNome,lerInt); // criacao do objeto de cada elemento do vetor
        }

        for(int i = 0; i < n; i++){ // print dos alunos
            System.out.printf("\nNome do aluno %d: %s",i+1,vet[i].retornaNome());
            System.out.printf("\nIdade do aluno %d: %d",i+1,vet[i].retornaIdade());
        }
        in.close();
    }
}