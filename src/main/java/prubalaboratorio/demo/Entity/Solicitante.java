package prubalaboratorio.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="solicitante")
public class Solicitante {
    @Id
    @Column(name="id_solicitante")
    private int IdSolicitante;
    @Column(name="nombres")
    private String nombres;
    @Column(name="apellidos")
    private String apellidos;
    @Column(name="carrera")
    private String carrera;
    @Column(name="semestre")
    private String semestre;
    @Column(name="estado")
    private int estado;
    @OneToOne
    @JoinColumn(name="id_TipoSolicitante")
    private TipoSolicitante idTipoSolicitante;

    @ManyToMany
    @JoinTable (name = "prestamo_equipos",
            joinColumns = @JoinColumn(name = "id_solicitante"),
            inverseJoinColumns = @JoinColumn(name = "id_equipo"))
    private Set<Equipo> equipos;

    @ManyToMany
    @JoinTable (name = "prestamo_herramientas",
            joinColumns = @JoinColumn(name = "id_solicitante"),
            inverseJoinColumns = @JoinColumn(name = "id_herramienta"))
    private Set<Herramienta> herramientas;


    public Solicitante() {

    }
}
