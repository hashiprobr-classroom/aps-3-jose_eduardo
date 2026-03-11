package vapor.src.test.java.br.edu.insper.desagil.aps3.vapor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import br.edu.insper.desagil.aps3.vapor.Usuario;
import vapor.src.main.java.br.edu.insper.desagil.aps3.vapor.Comunidade;

public class ComunidadeTest {

    @Test
    public void constroi() {
        Usuario u1 = new Usuario("ma7", "Matheus");
        Usuario u2 = new Usuario("joao", "Joao");

        Comunidade c = new Comunidade(
                new ArrayList<>(List.of(u1, u2))
        );

        assertEquals(List.of("ma7", "joao"), c.apelidosMembros());
    }

    @Test
    public void adicionaUmMembro() {
        Comunidade c = new Comunidade(new ArrayList<>());

        Usuario u1 = new Usuario("ma7", "Matheus");
        c.adicionaMembro(u1);

        assertEquals(List.of("ma7"), c.apelidosMembros());
    }

    @Test
    public void adicionaDoisMembros() {
        Comunidade c = new Comunidade(new ArrayList<>());

        Usuario u1 = new Usuario("ma7", "Matheus");
        Usuario u2 = new Usuario("joao", "Joao");

        c.adicionaMembro(u1);
        c.adicionaMembro(u2);

        assertEquals(List.of("ma7", "joao"), c.apelidosMembros());
    }
}