import java.util.Arrays;
import java.util.List;

public class Usuario implements IUsuario {
    private int id;
    private String nome;
    private String email;
    private String senha;

    public Usuario(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public int getId() {
        return this.id;
    }

    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.email);
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    public boolean validarSenha(String senha) {
        return this.senha.equals(senha);
    }


}


