package prubalaboratorio.demo.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="herramientas")
public class Herramienta {

    @Id
    @Column(name="id_herramienta")
    private int id;
    @Column(name="marca",nullable = false)
    private String marca;
    @Column(name="costo",nullable = false)
    private Double costo;
    @Column(name="cantidad",nullable = false)
    private int cantidad;
    @Column(name="modelo",nullable = false)
    private String modelo;
    @OneToOne
    @JoinColumn(name="id_tipoHerramienta",nullable = false)
    private TipoHerramienta tipoHerramienta;
    @Column(name="tipo_Uso",nullable = false)
    private int tipoUso;

    @ManyToMany(mappedBy = "herramientas")
    private Set<Solicitante> solicitante;



}
