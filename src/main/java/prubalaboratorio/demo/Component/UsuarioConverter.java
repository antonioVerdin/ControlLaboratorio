package prubalaboratorio.demo.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import prubalaboratorio.demo.Entity.TipoUsuario;
import prubalaboratorio.demo.Entity.Usuario;
import prubalaboratorio.demo.Model.UsuarioModel;
import prubalaboratorio.demo.Repository.TipoUsuarioRepository;

@Component("usuarioConverter")
public class UsuarioConverter {

    @Autowired
    @Qualifier("tipoUsuarioRepository")
    private TipoUsuarioRepository tipoUsuarioRepository;

    public Usuario convertirUserModelaUsuario(UsuarioModel usuarioModel){
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(usuarioModel.getIdUsuario());
        usuario.setContrasena(usuarioModel.getContrasena());
        usuario.setNombre(usuarioModel.getNombre());
        usuario.setApellido(usuarioModel.getApellido());
        usuario.setAdministrador(usuarioModel.isAdministrador());
        TipoUsuario tipoUsuario = tipoUsuarioRepository.findByIdTipoUsuario(usuarioModel.getIdTipoUsuario());

        usuario.setIdtipousuario(tipoUsuario);

        return usuario;
    }

    public UsuarioModel convertirUsuarioaUsuarioModel(Usuario usuario){
        UsuarioModel usuarioModel = new UsuarioModel();

        usuarioModel.setIdUsuario(usuario.getIdUsuario());
        usuarioModel.setContrasena(usuario.getContrasena());
        usuarioModel.setNombre(usuario.getNombre());
        usuarioModel.setApellido(usuario.getApellido());
        usuarioModel.setAdministrador(usuario.isAdministrador());
        usuarioModel.setIdTipoUsuario(usuario.getIdtipousuario().getIdTipoUsuario());




        return usuarioModel;
    }
}
