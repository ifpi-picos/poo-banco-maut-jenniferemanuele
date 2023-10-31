public class ContaCorrente extends Conta {
    private double chequeEspecial;
    private int transferenciasGratuitas = 2;

    public ContaCorrente(int agencia, int numeroAgencia, double saldo, String string,
            Cliente cliente, Notificacao notificacao, double chequeEspecial,
            int transferenciasGratuitas) {
        super(agencia, numeroAgencia, saldo, cliente, notificacao);

    }

    // método sem implementação
    @Override
    public double Saca(double valor) {
        notificacao.enviaNotificacao(
                "Operação de saque indisponivel na conta corrente. Valor disponivel na poupança",
                valor);
        return 0;
    }

    @Override
    public void Transfere(double valor, Conta contaDestino) {
        // essa regra parece incorreta, não consegui fazer transferencia mesmo com saldo positivo
        if (valor >= this.saldo && valor <= saldo + chequeEspecial) {
            this.setSaldo(this.getSaldo() - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            System.out.println("Você transferiu: R$" + valor + " da sua conta corrente ");

            if (transferenciasGratuitas <= 0) {
                double taxa = valor * 0.1;
                this.setSaldo(this.getSaldo() - taxa);
            }
            transferenciasGratuitas--;
            System.out.println("O saldo atual é: R$" + this.getSaldo());

            notificacao.enviaNotificacao("Transferência deferida no valor: ", valor);
        } else {
            System.out.println("Seu limite atual não possibilita esta transferência");
        }
    }
}
