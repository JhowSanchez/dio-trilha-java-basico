public class ContaTerminal {
    private static int numero;
    private String agencia;
    private String nomeCli;
    private Double saldo;

    public ContaTerminal(String agencia, String nomeCli, Double saldo) {
        numero++;
        this.agencia = agencia;
        this.nomeCli = nomeCli;
        this.saldo = saldo;
    }

    public ContaTerminal() {
        numero++;
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

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
