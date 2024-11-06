public class User {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    private String pass;

    public User(int numero, String agencia, String nomeCliente, double saldo, String pass) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.pass = pass;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {


        return "Conta: " + getNumero() +
                "\nAgência: " + getAgencia() +
                "\nNome do Cliente: " + getNomeCliente().toUpperCase() +
                "\nSaldo: " + getSaldo();

    }
}
