package vapor.src.test.java.br.edu.insper.desagil.aps3.vapor;

import br.edu.insper.desagil.aps3.vapor.Usuario;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void constroi() {
        Usuario u = new Usuario("ma7gam3r", "Matheus");

        assertEquals("ma7gam3r", u.getApelido());
        assertEquals("Matheus", u.getNome());
    }

    @Test
    public void mudaNome() {
        Usuario u = new Usuario("ma7gam3r", "Matheus");
        u.setNome("Jose Eduardo");

        assertEquals("Jose Eduardo", u.getNome());
    }
}