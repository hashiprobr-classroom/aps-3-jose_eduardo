package vapor.src.test.java.br.edu.insper.desagil.aps3.vapor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import br.edu.insper.desagil.aps3.vapor.Usuario;
import vapor.src.main.java.br.edu.insper.desagil.aps3.vapor.Jogo;
import vapor.src.main.java.br.edu.insper.desagil.aps3.vapor.Loja;
import org.junit.jupiter.api.BeforeEach;




public class LojaTest {

    private Loja loja;
    private Usuario dono;
    private Usuario outro;

    private Jogo j1;
    private Jogo j2;
    private Jogo j3;

    @BeforeEach
    public void setUp() {
        dono = new Usuario("ma7", "Matheus");
        outro = new Usuario("joao", "Joao");

        j1 = new Jogo(1, "Jogo1");
        j2 = new Jogo(2, "Jogo2");
        j3 = new Jogo(3, "Jogo3");

        loja = new Loja(dono, List.of(j1, j2, j3));
    }

    @Test
    public void constroi() {
        assertEquals("ma7", loja.getDono().getApelido());
        assertEquals(0, loja.numeroAvaliados(dono));
    }

    @Test
    public void umUsuarioAvaliaUmJogo() {
        j1.avalia("ma7", 5);

        assertEquals(1, loja.numeroAvaliados(dono));
    }

    @Test
    public void umUsuarioAvaliaDoisJogos() {
        j1.avalia("ma7", 5);
        j2.avalia("ma7", 4);

        assertEquals(2, loja.numeroAvaliados(dono));
    }

    @Test
    public void doisUsuariosAvaliamUmJogo() {
        j1.avalia("ma7", 5);
        j1.avalia("joao", 3);

        assertEquals(1, loja.numeroAvaliados(dono));
        assertEquals(1, loja.numeroAvaliados(outro));
    }

    @Test
    public void doisUsuariosAvaliamDoisJogos() {
        j1.avalia("ma7", 5);
        j2.avalia("joao", 3);

        assertEquals(1, loja.numeroAvaliados(dono));
        assertEquals(1, loja.numeroAvaliados(outro));
    }
}
