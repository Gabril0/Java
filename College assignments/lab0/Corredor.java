public class Corredor extends Atleta{
    Corredor(String nome, int idade,float peso, float altura){
        super( nome,  idade, peso,  altura);
    }
    
    public void jogar() {
        System.out.println(getNome() + " correu bastante");    
    }
}
