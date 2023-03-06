public class Atacante extends Atleta{
    Atacante(String nome, int idade,float peso, float altura){
        super( nome,  idade, peso,  altura);
    }
    public void jogar(){
        System.out.println(getNome() + " jogou extremamente bem como atacante!");
    }

}
