public class UsuarioADM {
    private String nome;
    private boolean administrador;

    public UsuarioADM(String nome, boolean administrador) {
        this.nome = nome;
        this.administrador = administrador;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAdministrador() {
        return this.administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public void alterarSenhaUsuario(IUsuario usuario, String novaSenha) {
        if (!this.administrador) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        } else {
            usuario.alterarSenha(novaSenha);
        }
    }
}
