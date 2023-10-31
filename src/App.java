import java.sql.Date;

public class App {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Antônio Bonfim", 183, "Junco", "Picos", "PI", null);
        Cliente cliente1 =
                new Cliente("101.696.063-84", "Jennifer", new Date(2004, 03, 29), endereco);
        Conta cc = new ContaCorrente(994, 002, 100.00, "corrente", cliente1, new Email(), 50.00, 2);
        Conta cc2 =
                new ContaCorrente(994, 002, 100.00, "corrente", cliente1, new Email(), 50.00, 2);
        Conta cp = new ContaPoupanca(234, 004, 100.00, "poupança", cliente1, new Sms(), 0.1);

        // nomes de métodos não iniciam com letras maiúsculas.
        cc.Deposita(100); // não está funcionando
        System.out.println(cc.getSaldo());
        cc.Saca(50); // não está funcionando
        System.out.println(cc.getSaldo());
        cc.Transfere(10, cc2); // não está funcionando
        cc.Transfere(10, cc2);
        cc.Transfere(10, cc2);
        cc.Transfere(10, cc2);
        cc.Transfere(10, cc2);
        cc.Transfere(10, cc2);
        System.out.println(cc.getSaldo());

        cp.Deposita(100); // não está funcionando
        System.out.println(cp.getSaldo());
        cp.Saca(10);

        System.out.println(cp.getSaldo());
    }
}
