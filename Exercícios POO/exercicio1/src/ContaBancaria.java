public class ContaBancaria {

    private String nome;
    private double saldo;
    private double chequeEspecial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
        if(saldo <= 500.00) {
            setChequeEspecial(50.00);
        }
        else {
            setChequeEspecial(saldo/2);
        }
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void retirar(double valor){
        this.saldo -= valor;
    }


}
