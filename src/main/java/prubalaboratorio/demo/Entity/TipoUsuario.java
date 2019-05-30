package prubalaboratorio.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="tipo_usuario")
public class TipoUsuario {

    @Id
    @GeneratedValue
    @Column(name="id_tipoUsuario")
    private int idTipoUsuario;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;


    public TipoUsuario() {

    }
}
