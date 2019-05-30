package prubalaboratorio.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="estado_prestamo_herramientas")
public class EstadoPrestamoHerramienta {
    @Id
    @GeneratedValue
    @Column(name="id_estado")
    int idEstado;
    @Column(name="estado")
    String estado;

    public EstadoPrestamoHerramienta(){

    }



}
