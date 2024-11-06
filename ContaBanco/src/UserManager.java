import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    // Método para adicionar um usuário
    public void addUser(User user) {
        users.add(user);
    }

    // Método para listar todos os usuários
    public void listarUsuarios() {
        for (User user : users) {
            System.out.println(user.toString() + "\n");
        }
    }

    // Método para buscar um usuário por número de conta
    public User buscarUsuario(int numero) {
        for (User user : users) {
            if (user.getNumero() == numero) {
                return user;
            }
        }
        return null; // Retorna null se o usuário não for encontrado
    }

    // Validar login
    public User buscarConta(int numero, String agencia, String pass) {
        for (User user : users) {
            if (user.getNumero() == numero && user.getAgencia().equals(agencia) && user.getPass().equals(pass)) {
                return user;
            }
        }
        return null; // Retorna null se o usuário não for encontrado
    }

}
