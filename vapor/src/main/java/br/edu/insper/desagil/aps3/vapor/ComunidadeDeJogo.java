package vapor.src.main.java.br.edu.insper.desagil.aps3.vapor;

import br.edu.insper.desagil.aps3.vapor.Usuario;

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
