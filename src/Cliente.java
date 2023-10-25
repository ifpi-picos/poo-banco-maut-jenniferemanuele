import java.time.LocalDate;
public class Cliente {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco; 

    public void Cliente(String cpf, String nome, LocalDate dataNacimento, Endereco endereco){
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento; 
        this.endereco = endereco;
    }
}
