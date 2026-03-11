package br.edu.insper.desagil.aps3.vapor;

public class ComunidadeDeJogo extends Comunidade {

    private Jogo jogo;

    public ComunidadeDeJogo(Jogo jogo, java.util.List<Usuario> membros) {
        super(membros);
        this.jogo = jogo;
    }

    @Override
    public void adicionaMembro(Usuario usuario) {
        if (jogo.avaliado(usuario.getApelido())) {
            membros.add(usuario);
        }
    }
}
