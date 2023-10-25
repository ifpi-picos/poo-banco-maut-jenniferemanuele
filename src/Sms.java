public class Sms implements Notificacao {
    public void enviaNotificacao(String operacao, double valor){
      System.out.println("Notificação enviada via sms");
      System.out.println("Operação " + operacao);
      System.out.println("Valor "+ valor);
    }
}
