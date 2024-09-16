// Se estiver utilizando pacotes, adicione:
package Vetor;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        // Adicionar elementos ao vetor
        vetor.adiciona(new Contato("João", "joao@email.com", "1234-5678"));
        vetor.adiciona(new Contato("Maria", "maria@email.com", "9876-5432"));
        vetor.adiciona(new Contato("Ana", "ana@email.com", "4321-8765"));

        // Verificar a quantidade de elementos do vetor
        System.out.println("Tamanho do Vetor: " + vetor.tamanho());

        // Imprimir elementos do vetor
        System.out.println(vetor);

        // Obter elemento de uma posição do vetor
        System.out.println("Elemento na posição 2: " + vetor.busca(2).getNome());

        // Adicionar elemento em qualquer posição do vetor
        vetor.adiciona(1, new Contato("Carlos", "carlos@email.com", "5678-1234"));
        System.out.println("Após adicionar Carlos na posição 1: " + vetor);

        // Verificar se o elemento existe no vetor por nome
        int pos = vetor.busca("Carlos");
        if (pos >= 0) {
            System.out.println("Carlos encontrado na posição: " + pos);
        } else {
            System.out.println("Carlos não foi encontrado.");
        }

        // Remover um elemento de uma posição específica
        vetor.remove(2);
        System.out.println("Depois de remover o elemento na posição 2: " + vetor);

        // Ordenar os elementos pelo nome
        vetor.ordena();
        System.out.println("Elementos após ordenação: " + vetor);
    }
}


/*package Vetor;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        // Adicionar elemento ao final do vetor
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        // Verificar a quantidade de elementos do vetor
        System.out.println("Tamanho do Vetor " + vetor.tamanho());

        // Imprimir elementos do vetor
        System.out.println(vetor);

        // Obter elemento de uma posição do vetor
        System.out.println("Elemento na posição 2: " + vetor.busca(2));

        // Adicionar elemento em qualquer posição do vetor
        vetor.adiciona(1, "Elemento 4");
        // Imprimindo elemento na posição 1 de indice 1
        System.out.println(vetor);

        //  Verificando se o elemento existe no vetor
        int pos = vetor.busca("Elemento 4");
        if (pos >= 0) {
            System.out.println("Elemento encontrado na posição: " + pos);
        } else {
            System.out.println("Não foi possível encontrar o elemento.");
        }
        
        //Removendo um elemento de uma posição específica, no indice 2.
        vetor.remove(2);
        System.out.println("Depois de remover" + vetor);
    }
}
*/