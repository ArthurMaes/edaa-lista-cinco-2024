public class Contato {
    private String nome;
    private String telefone;
    private String numero;

    public String getNumero() {
        return numero;
    }

    public Contato(String nome, String telefone, String numero) {
        this.nome = nome;
        this.telefone = telefone;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nTelefone: " + telefone + "\nNúmero: "+ numero;
    }
}