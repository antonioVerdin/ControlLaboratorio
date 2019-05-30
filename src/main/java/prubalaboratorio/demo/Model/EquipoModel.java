package prubalaboratorio.demo.Model;

import lombok.Data;
import prubalaboratorio.demo.Entity.Solicitante;

import java.util.Set;

@Data
public class EquipoModel {


    private int idEquipo;
    private String etiqueta;
    private String marca;
    private Double costo;
    private String modelo;
    private int tipoEquipo;
    private int ram;
    private String procesador;
    private int capacidad;
    private String sOperativo;
    private int tipoUso;
    private int estadoEquipo;
    private Set<Solicitante> solicitante;

    public EquipoModel(){

    }
}
