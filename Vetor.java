package Vetor;

public class Vetor {

    private Contato[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new Contato[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Contato elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Contato[] elementosNovos = new Contato[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i].getNome());
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1].getNome());
        }
        s.append("]");
        return s.toString();
    }

    public Contato busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(String nome) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].pesquisaPorNome(nome)) {
                return i;
            }
        }
        return -1;
    }

    public boolean adiciona(int posicao, Contato elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    // Método para ordenar os contatos pelo nome
    public void ordena() {
        for (int i = 0; i < this.tamanho - 1; i++) {
            for (int j = 0; j < this.tamanho - 1 - i; j++) {
                if (this.elementos[j].getNome().compareTo(this.elementos[j + 1].getNome()) > 0) {
                    Contato temp = this.elementos[j];
                    this.elementos[j] = this.elementos[j + 1];
                    this.elementos[j + 1] = temp;
                }
            }
        }
    }
}
