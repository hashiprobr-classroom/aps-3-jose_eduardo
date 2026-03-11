package vapor.src.test.java.br.edu.insper.desagil.aps3.vapor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import vapor.src.main.java.br.edu.insper.desagil.aps3.vapor.Jogo;

public class JogoTest {

    @Test
    public void constroi() {
        Jogo j = new Jogo(1, "Joao Marcos");

        assertEquals(1, j.getId());
        assertEquals("Joao Marcos", j.getNome());
        assertEquals(0.0, j.media(), 0.01);
    }

    @Test
    public void avaliaUmaVez() {
        Jogo j = new Jogo(1, "Joao Marcos");

        j.avalia("jose", 3);

        assertTrue(j.avaliado("jose"));
        assertFalse(j.avaliado("joao"));
        assertEquals(3.0, j.media(), 0.01);
    }

    @Test
    public void avaliaDuasVezes() {
        Jogo j = new Jogo(1, "Joao Marcos");

        j.avalia("jose", 3);
        j.avalia("joao", 4);

        assertTrue(j.avaliado("jose"));
        assertTrue(j.avaliado("joao"));
        assertEquals(3.5, j.media(), 0.01);
    }

    @Test
    public void avaliaTresVezes() {
        Jogo j = new Jogo(1, "Joao Marcos");

        j.avalia("jose", 3);
        j.avalia("joao", 4);
        j.avalia("jose", 5);

        assertEquals(4.5, j.media(), 0.01);
    }
}
