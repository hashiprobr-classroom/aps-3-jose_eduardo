package vapor.src.test.java.br.edu.insper.desagil.aps3.vapor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import vapor.src.main.java.br.edu.insper.desagil.aps3.vapor.ComunidadeDeJogo;
import vapor.src.main.java.br.edu.insper.desagil.aps3.vapor.Jogo;
import br.edu.insper.desagil.aps3.vapor.Usuario;

import java.util.List;
import java.util.ArrayList;

public class ComunidadeDeJogoTest {

    @Test
    public void adicionaDoisInvalidos() {
        Jogo jogo = new Jogo(1, "Matheus");

        ComunidadeDeJogo c = new ComunidadeDeJogo(
                jogo, new ArrayList<>()
        );

        Usuario u1 = new Usuario("capito", "Jose Eduardo");
        Usuario u2 = new Usuario("joao", "Joao");

        c.adicionaMembro(u1);
        c.adicionaMembro(u2);

        assertEquals(List.of(), c.apelidosMembros());
    }

    @Test
    public void adicionaUmInvalidoUmValido() {
        Jogo jogo = new Jogo(1, "Matheus");

        Usuario u1 = new Usuario("capito", "Jose Eduardo");
        Usuario u2 = new Usuario("joao", "Joao");

        jogo.avalia("joao", 4);

        ComunidadeDeJogo c = new ComunidadeDeJogo(
                jogo, new ArrayList<>()
        );

        c.adicionaMembro(u1);
        c.adicionaMembro(u2);

        assertEquals(List.of("joao"), c.apelidosMembros());
    }

    @Test
    public void adicionaDoisValidos() {
        Jogo jogo = new Jogo(1, "Matheus");

        Usuario u1 = new Usuario("capito", "Jose Eduardo");
        Usuario u2 = new Usuario("joao", "Joao");

        jogo.avalia("capito", 3);
        jogo.avalia("joao", 4);

        ComunidadeDeJogo c = new ComunidadeDeJogo(
                jogo, new ArrayList<>()
        );

        c.adicionaMembro(u1);
        c.adicionaMembro(u2);

        assertEquals(List.of("capito", "joao"), c.apelidosMembros());
    }
}
