package prubalaboratorio.demo.Service;

import org.springframework.stereotype.Service;
import prubalaboratorio.demo.Entity.Usuario;
import prubalaboratorio.demo.Model.UsuarioModel;

import java.util.List;

public interface UsuarioService {

    public abstract UsuarioModel addUser(UsuarioModel usuarioModel);

    public abstract List<UsuarioModel> listAllUsers();

    public abstract Usuario findUsuarioByIdUsuario(String idUsuario);

    public abstract void removerUsuario(String idUsuario);

    public abstract UsuarioModel findUserByIdUsuarioModel(String idUsuario);
}
