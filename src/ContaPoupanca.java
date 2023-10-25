public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(int agencia, int numero, double saldo, String string, Cliente cliente, Notificacao notificacao, double d) {
        super(agencia, numero, saldo, cliente, notificacao);
        this.rendimento = 0.1;
    }

    public double setRendimento(double rendimento) {
        return this.rendimento = rendimento;
    }

    @Override
    public boolean Deposita(double valor){
        if(valor < 0){
            this.saldo += valor + (valor * rendimento);
           System.out.println("Seu depósito é de " + valor+"R$  na sua conta poupança.");
           System.out.println("Saldo atual de: R$ " + this.saldo);
           notificacao.enviaNotificacao("Operação ", valor);
           notificacao.enviaNotificacao("Deposito no valor de: R$", valor);
           return true;
           }
           else{
               System.out.println("Deposito inválido ");
               return false; 
           } 
        }



    @Override
    public double Saca(double valor) { 
        if(valor > 0 &&  valor <= this.saldo){
            double taxa = valor * 0.05;
            this.saldo -= (valor + taxa);
            System.out.println("Seu saque foi de: R$ " + valor + ": Conta poupança");
            System.out.println("saldo atual: " + this.saldo );
            notificacao.enviaNotificacao("saque feito no valor de: " , valor);

        }else{
            System.out.println("Seu saldo é insuficiente para a realização do saque");
        }
        return valor;
    
    }

    @Override
    public void Transfere(double valor, Conta contaDestino) {
    
        throw new UnsupportedOperationException("Unimplemented method 'Transfere'");
    }
}
