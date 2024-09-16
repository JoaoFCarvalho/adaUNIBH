import java.util.ArrayList;

public class TestaArrayList {
    public static void main(String[] args) {
        ArrayList<Contato> listaContatos = new ArrayList<>();

        // Adicionar elemento ao final
        listaContatos.add(new Contato("João", "joao@email.com", "1234-5678"));
        listaContatos.add(new Contato("Maria", "maria@email.com", "9876-5432"));

        // Verificar a quantidade de elementos
        System.out.println("Quantidade de contatos: " + listaContatos.size());

        // Imprimir elementos do vetor
        for (Contato contato : listaContatos) {
            System.out.println("Nome: " + contato.getNome() + ", Email: " + contato.getEmail() + ", Telefone: " + contato.getTelefone());
        }

        // Obter elemento de uma posição
        Contato contatoPosicao = listaContatos.get(1);
        System.out.println("Contato na posição 1: " + contatoPosicao.getNome());

        // Verificar se elemento existe (por nome)
        boolean encontrado = listaContatos.stream().anyMatch(c -> c.pesquisaPorNome("João"));
        System.out.println("João está na lista? " + encontrado);

        // Adicionar elemento em qualquer posição
        listaContatos.add(1, new Contato("Ana", "ana@email.com", "4321-8765"));

        // Remover elemento do vetor
        listaContatos.remove(0);

        // Pesquisar por nome
        for (Contato contato : listaContatos) {
            if (contato.pesquisaPorNome("Maria")) {
                System.out.println("Contato encontrado por nome: " + contato.getNome());
            }
        }

        // Pesquisar por e-mail
        for (Contato contato : listaContatos) {
            if (contato.pesquisaPorEmail("ana@email.com")) {
                System.out.println("Contato encontrado por e-mail: " + contato.getEmail());
            }
        }

        // Pesquisar por telefone
        for (Contato contato : listaContatos) {
            if (contato.getTelefone().equals("4321-8765")) {
                System.out.println("Contato encontrado por telefone: " + contato.getTelefone());
            }
        }
    }
}
