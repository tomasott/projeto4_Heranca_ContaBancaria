package entities;

public class ContaPF extends Conta{

    private String cpf;

    public ContaPF(int nro, String nome, String cpf) {
        super(nro, nome);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaPF{" +
                "cpf='" + cpf + '\'' +
                '}';
    }
}
