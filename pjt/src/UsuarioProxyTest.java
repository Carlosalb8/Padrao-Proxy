import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UsuarioProxyTest {

    @Test
    public void testObterDadosPessoais() {
        Usuario usuario1 = new Usuario(1, "João", "joao@email.com", "senha");
        Usuario usuario2 = new Usuario(2, "Maria", "maria@email.com", "outrasenha");
        List<String> dadosPessoais1 = usuario1.obterDadosPessoais();
        List<String> dadosPessoais2 = usuario2.obterDadosPessoais();
        assertEquals("João", dadosPessoais1.get(0));
        assertEquals("joao@email.com", dadosPessoais1.get(1));
        assertEquals("Maria", dadosPessoais2.get(0));
        assertEquals("maria@email.com", dadosPessoais2.get(1));
    }
    @Test
    public void testAlterarSenhaUsuarioADM() {
        Usuario usuario1 = new Usuario(1, "João", "joao@email.com", "senha");
        UsuarioADM adm = new UsuarioADM("Admin", true);
        adm.alterarSenhaUsuario(usuario1, "novaSenha");
        assertTrue(usuario1.validarSenha("novaSenha"));
    }

    @Test
    public void testAlterarSenhaUsuario() {
        Usuario usuario1 = new Usuario(2, "Maria", "maria@email.com", "outrasenha");
        UsuarioADM adm = new UsuarioADM("Admin", false);
        adm.alterarSenhaUsuario(usuario1, "novaSenha2");
        assertTrue(usuario1.validarSenha("novaSenha2"));
    }

}
