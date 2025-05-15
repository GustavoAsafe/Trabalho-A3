package Login;

import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<String, String> usuarios = new HashMap<>();

    public Login() {
        // Aqui você pode adicionar usuários e senhas fixos
        usuarios.put("admin", "1234");
        usuarios.put("professor", "senha123");
    }

    public boolean autenticar(String usuario, String senha) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(senha);
    }
}
