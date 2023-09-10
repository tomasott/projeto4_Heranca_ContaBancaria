package entities;

public class Conta {

    private int nro;
    private String nome;
    private double saldo;


    public Conta() {

    }

    public Conta(int nro, String nome) {
        this.nro = nro;
        this.nome = nome;
        this.saldo = 0.0;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nro=" + nro +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
