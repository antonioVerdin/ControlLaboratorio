package prubalaboratorio.demo.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="tipo_herramienta")
public class TipoHerramienta {
    @Id
    @Column(name="id_tipoHerramienta")
    private int idTipoHerramienta;
    @Column(name="tipo_herramienta")
    private String tipoHerramienta;

    public TipoHerramienta() {

    }
}
