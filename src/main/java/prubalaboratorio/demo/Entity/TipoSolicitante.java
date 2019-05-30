package prubalaboratorio.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="tipo_solicitante")
public class TipoSolicitante {
    @Id
    @GeneratedValue
    @Column(name="id_tipoSolicitante")
    int idTipoSolicitante;
    @Column(name="tipo_solicitante")
    String tipoSolicitante;


    public TipoSolicitante(String tipoSolicitante) {
        this.tipoSolicitante = tipoSolicitante;
    }
}
