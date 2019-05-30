package prubalaboratorio.demo.Model;

import lombok.Data;
import prubalaboratorio.demo.Entity.TipoUsuario;

@Data
public class UsuarioModel {
    private String idUsuario;
    private String contrasena;
    private String nombre;
    private String apellido;
    private int idTipoUsuario;
    private boolean administrador;

    public UsuarioModel(){

    }
}
