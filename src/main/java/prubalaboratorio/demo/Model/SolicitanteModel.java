package prubalaboratorio.demo.Model;

import lombok.Data;
import prubalaboratorio.demo.Entity.Equipo;

import java.util.Set;

@Data
public class SolicitanteModel {
   private int idSolicitante;
   private String nombres;
   private String apellidos;
   private  String carrera;
   private String semestre;
   private int estado;
   private String idTipoSolicitante;
   private Set<Equipo> equipos;


   public SolicitanteModel(){

   }

}
