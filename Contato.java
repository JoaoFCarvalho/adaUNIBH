package Vetor;

public class Contato {
    private final String nome;
    private final String email;
    private final String telefone;

    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean pesquisaPorNome(String nome) {
        return this.nome.equalsIgnoreCase(nome);
    }

    public boolean pesquisaPorEmail(String email) {
        return this.email.equalsIgnoreCase(email);
    }
}
