import java.util.Scanner;

public class Honda implements Marcas{
    @Override
    public Carro geraCarro() {
        int op;
        Scanner in = new Scanner(System.in);
        System.out.println("Qual carro voce deseja?");
        System.out.println("1.Honda 1");
        System.out.println("1.Honda 2");
        op = in.nextInt();

        if (op == 1) return new CarroHonda1();
        if (op == 2) return new CarroHonda2();
        else return null;
    }
}
