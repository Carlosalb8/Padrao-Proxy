import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Usuario> usuarios = new HashMap<>();

    public static Usuario getUsuario(int id) {
        return usuarios.get(id);
    }

    public static void addUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }
}