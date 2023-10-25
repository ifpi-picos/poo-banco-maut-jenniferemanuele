public class Email implements Notificacao {
    public void enviaNotificacao(String operacao, double valor){
        System.out.println("Notificação entregue para o seu e-mail");
        System.out.println("Operação " + operacao);
        System.out.println("Valor " + valor);
    }
}
