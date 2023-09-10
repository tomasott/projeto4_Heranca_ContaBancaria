import entities.Conta;
import entities.ContaPF;
import entities.ContaPJ;

public class Program {

    public static void main(String[] args) {

        Conta c1 = new Conta(21444,"Pedro Alves");
        System.out.println(c1);

        ContaPF cPF1 = new ContaPF(25554,"Maria Silva","222.332.125.46");
        System.out.println(cPF1);

        ContaPJ cPJ1 = new ContaPJ(47927,"Empresa LOL","12877.231/0001-01");
        System.out.println(cPJ1);


    }
}
