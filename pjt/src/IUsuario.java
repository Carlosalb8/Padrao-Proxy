import java.util.List;

public interface IUsuario {
    List<String> obterDadosPessoais();
    void alterarSenha(String novaSenha);
}
