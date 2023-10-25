import java.sql.Date;

public class App {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Antônio Bonfim", 183, "Junco", "Picos", "PI", null);
        Cliente cliente1 = new Cliente("101.696.063-84", "Jennifer", new Date(2004, 03,29), endereco);
        Conta contaCorrente = new ContaCorrente(994, 002, 500.00, "corrente", cliente1, new Email(), 50.00, 2);
        Conta contaPoupanca = new ContaPoupanca(234, 004, 700.00, "poupança", cliente1, new Sms(),0.1);

        // Métodos da conta corrente
        System.out.println("\n");
        contaCorrente.Deposita(500);
        System.out.println("\n");
        contaCorrente.Saca(20);
        System.out.println("\n");
        contaCorrente.Transfere(400, contaPoupanca);
        System.out.println("\n");
        contaCorrente.Transfere(300, contaPoupanca);
        System.out.println("\n");
        contaCorrente.Transfere(30, contaPoupanca);
        System.out.println("\n");

        
        contaPoupanca.Deposita(50);
        System.out.println("\n");
        contaPoupanca.Saca(140);
        System.out.println("\n");
        contaPoupanca.Transfere(20, contaCorrente);
    }
}