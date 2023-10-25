public class ContaCorrente extends Conta{
    private double chequeEspecial;
    private int transferenciasGratuitas = 2;
    public ContaCorrente(int agencia, int numeroAgencia, double saldo, Cliente cliente, Notificacao notificacao, double chequeEspecial, int transferenciasGratuitas) {
        super(agencia, numeroAgencia, saldo, cliente, notificacao);
       
    }
    @Override
    public double Saca(double valor) { 
        if(valor > 0 &&  valor <= this.saldo + this.chequeEspecial){
            this.saldo -= valor;
            System.out.println("Seu saque foi de: R$ " + valor);
            notificacao.enviaNotificacao("saque feito no valor de: " , valor);
        }else{
            System.out.println("Seu saldo é insuficiente para a realização do saque");
        }
        return valor;
    
    }
    @Override
    public void Transfere(double valor, Conta contaDestino) {
        if(valor >= this.saldo && valor <= saldo + chequeEspecial){
         this.setSaldo(this.getSaldo()- valor);
        }
    }
}
