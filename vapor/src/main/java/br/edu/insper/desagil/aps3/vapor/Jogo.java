package br.edu.insper.desagil.aps3.vapor;
import java.util.HashMap;
import java.util.Map;

public class Jogo {

    private final int id;
    private final String nome;
    private Map<String, Integer> avaliacoes;

    public Jogo(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.avaliacoes = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    // adiciona avaliacao (apelido -> nota)
    public void avalia(String apelido, int avaliacao) {
        avaliacoes.put(apelido, avaliacao);
    }

    // verifica se apelido avaliou
    public boolean avaliado(String apelido) {
        return avaliacoes.containsKey(apelido);
    }

    // media das avaliacoes
    public double media() {
        if (avaliacoes.isEmpty()) {
            return 0.0;
        }

        int soma = 0;
        for (int nota : avaliacoes.values()) {
            soma += nota;
        }

        return (double) soma / avaliacoes.size();
    }
}
