package entities;


public class ContaPJ extends Conta{

    private String cnpj;

    public ContaPJ(int nro, String nome, String cnpj) {
        super(nro, nome);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaPJ{" +
                "cnpj='" + cnpj + '\'' +
                '}';
    }

}
