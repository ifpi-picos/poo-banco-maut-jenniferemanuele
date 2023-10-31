public abstract class Conta {
    private int agencia;
    private int numeroAgencia;
    protected double saldo;
    private Cliente cliente;
    protected Notificacao notificacao;
    // está faltando guardar o histórico de transações

    public Conta(int agencia, int numero, double saldo, Cliente cliente, Notificacao notificacao) {
        this.agencia = agencia;
        this.numeroAgencia = numero;
        this.saldo = saldo;
        this.cliente = cliente;
        this.notificacao = notificacao;
    }

    // nomes de métodos não iniciam com letras maiúsculas.
    public boolean Deposita(double valor) {
        // essa validação está incorreta
        if (valor < 0) {
            this.saldo += valor;
            System.out.println("Seu depósito é de " + valor + "R$");
            System.out.println("Depósito realizado com sucesso. ");
            notificacao.enviaNotificacao("Operação ", valor);
            return true;
        } else {
            System.out.println("Seu saldo é insuficiente ");
            return false;

        }
    }

    public abstract double Saca(double valor);


    public abstract void Transfere(double valor, Conta contaDestino);

    public Notificacao getNotificacao() {
        return notificacao;
    }


    public int getAgencia() {
        return agencia;
    }


    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }


    public int getNumeroAgencia() {
        return numeroAgencia;
    }


    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void setNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }


}
