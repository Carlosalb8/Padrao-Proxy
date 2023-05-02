import java.util.List;

public class UsuarioProxy implements IUsuario {
    private Usuario usuario;
    private int id;

    public UsuarioProxy(int id) {
        this.id = id;
    }

    public List<String> obterDadosPessoais() {
        if (this.usuario == null) {
            this.usuario = BD.getUsuario(this.id);
        }

        return this.usuario.obterDadosPessoais();
    }

    public void alterarSenha(String novaSenha) {
        if (this.usuario == null) {
            this.usuario = BD.getUsuario(this.id);
        }

        this.usuario.alterarSenha(novaSenha);
    }
}
