public class Tenista extends Atleta {
    Tenista(String nome, int idade,float peso, float altura){
        super( nome,  idade, peso,  altura);}

    public void jogar() {
        System.out.println(getNome() + " rebateu a bola com a raquete!");
    }
}
