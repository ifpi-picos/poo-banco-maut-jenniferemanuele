public class Endereco {
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado; 

    public Endereco(String logradouro, int numero, String bairro, String cidade, String estado){
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade; 
        this.estado = estado; 
    }
}
