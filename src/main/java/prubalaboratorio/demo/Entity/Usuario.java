package prubalaboratorio.demo.Entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Data
@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @Column(name = "id_usuario", unique = true, nullable = false)
    private String idUsuario;
    @Column(name = "contrasena", nullable = false, length = 60)
    private String contrasena;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @OneToOne
    @JoinColumn(name="id_tipousuario")
    private TipoUsuario idtipousuario;
    @Column(name="administrador")
    private boolean administrador;



    public Usuario() {

    }
}
