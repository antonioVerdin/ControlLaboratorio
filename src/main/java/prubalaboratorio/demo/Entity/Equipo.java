package prubalaboratorio.demo.Entity;

import lombok.Data;
import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="equipos")
public class Equipo {
    @Id
    @GeneratedValue
    @Column(name="id_equipo")
    private int idEquipo;
    @Column(name="etiqueta")
    private String etiqueta;
    @Column(name="marca",nullable = false)
    private String marca;
    @Column(name="costo",nullable = false)
    private Double costo;

    @Column(name="modelo",nullable = false)
    private String modelo;

    @Column(name="ram")
    private int ram;
    @Column(name="procesador")
    private String procesador;
    @Column(name="capacidad")
    private int capacidad;
    @Column(name="SOperativo")
    private String sOperativo;
    @Column(name="tipo_Uso",nullable = false)
    private int tipoUso;
    @Column(name="estado_equipo",nullable = false)
    private int estadoEquipo;

    @ManyToMany(mappedBy = "equipos")
    private Set<Solicitante> solicitante;

    public Equipo(){

    }
}
